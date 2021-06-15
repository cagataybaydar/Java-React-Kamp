package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javacamp.hrms.business.abstracts.JobAdvertService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.ErrorResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.JobAdvertDao;
import javacamp.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertManager implements JobAdvertService {

	private JobAdvertDao jobAdvertDao;
	
	@Autowired
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {
		this.jobAdvertDao = jobAdvertDao;
	}
	
	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		if (!CheckIfNullField(jobAdvertisement)) {
			return new ErrorResult("Eksik bilgi girdiniz.Lütfen tüm alanları doldurunuz.");
		}
		this.jobAdvertDao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı eklendi.");
	}

	@Override
	public Result update(JobAdvertisement jobAdvertisement) {
		this.jobAdvertDao.save(jobAdvertisement);
		return new SuccessResult("İş ilanı güncellendi.");
	}

	@Override
	public Result delete(int id) {
		this.jobAdvertDao.deleteById(id);
		return new SuccessResult("İş ilanı silindi.");
	}

	@Override
	public Result changeActivityStatus(int id) {
		if (getById(id) == null) {
			return new ErrorResult("Böyle bir iş ilanı yok!");
		}
		if(getById(id).getData().isActive() == false) {
			return new ErrorResult("Bu iş ilanı zaten kapalı!");
		}
		JobAdvertisement jobAdvertisement = getById(id).getData();
		jobAdvertisement.setActive(false);
		update(jobAdvertisement);
		return new SuccessResult("İş ilanı kapalı duruma getirilmiştir!");
	}
	
	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		this.jobAdvertDao.findAll();
		return new SuccessDataResult<List<JobAdvertisement>>("Data listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllActiveJobAdvertList() {
		this.jobAdvertDao.getAllOpenJobAdvertisementList();
		return new SuccessDataResult<List<JobAdvertisement>>("Data listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllActiveJobAdvertByEmployer(int id) {
		this.jobAdvertDao.getAllOpenJobAdvertisementByEmployer(id);
		return new SuccessDataResult<List<JobAdvertisement>>("Data listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllByOrderByPublishedAt() {
		this.jobAdvertDao.getAllByOrderByPublishedAtDesc();
		return new SuccessDataResult<List<JobAdvertisement>>("Data listelendi");
	}

	@Override
	public DataResult<JobAdvertisement> getById(int jobAdvertId) {
		this.jobAdvertDao.getById(jobAdvertId);
		return new SuccessDataResult<JobAdvertisement>("Data listelendi");
	}
	
	private boolean CheckIfNullField(JobAdvertisement jobAdvertisement) {
		if (jobAdvertisement.getJobTitle() != null && jobAdvertisement.getDescription() != null
				&& jobAdvertisement.getCities() != null && 
				jobAdvertisement.getOpenPositions() != 0) {
			return true;
		}
		return false;
	}

}
