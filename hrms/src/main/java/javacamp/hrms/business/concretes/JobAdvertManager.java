package javacamp.hrms.business.concretes;

import java.util.Date;
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
		this.jobAdvertDao.save(jobAdvertisement);
		return new SuccessResult("Data eklenmiştir");
	}
	
	@Override
	public Result update(JobAdvertisement jobAdvertisement) {
		this.jobAdvertDao.save(jobAdvertisement);
		return new SuccessResult("Data güncellenmiştir");
	}
	
	@Override
	public DataResult<JobAdvertisement> getByJobAdvertId(int jobAdvertId) {
		return new SuccessDataResult<JobAdvertisement>
		(this.jobAdvertDao.getByJobAdvertId(jobAdvertId));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllByIsActive(boolean isActive) {
		this.jobAdvertDao.findAll();
		return new SuccessDataResult<List<JobAdvertisement>>("Data listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveAndEmployer_Id(boolean isActive, int employerId) {
		this.jobAdvertDao.getByIsActiveAndEmployer_Id(isActive, employerId);
		return new SuccessDataResult<List<JobAdvertisement>>("Data listelendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveAndDeadLine(boolean isActive, Date deadLine) {
		this.jobAdvertDao.getByIsActiveAndDeadLine(isActive, deadLine);
		return new SuccessDataResult<List<JobAdvertisement>>("Data listelendi");
	}

	@Override
	public Result changeActivityStatus(int jobAdvertId) {
		if(getByJobAdvertId(jobAdvertId)==null) {
		return new ErrorResult("Böyle bir iş ilanı mevcut değil");
		}
		if(getByJobAdvertId(jobAdvertId).getData().isActive()==false) {
		return new ErrorResult("Bu iş ilanı aktif değildir");
		}
		JobAdvertisement jobAdvertisement = getByJobAdvertId(jobAdvertId).getData();
		jobAdvertisement.setActive(false);
		update(jobAdvertisement);
		return new SuccessResult("Data pasif hale getirilmiştir");
	}
}
