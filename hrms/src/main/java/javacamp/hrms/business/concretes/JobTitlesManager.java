package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.JobTİtlesService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.JobTitlesDao;
import javacamp.hrms.entities.concretes.JobTitles;

@Service // Bu projede servis görevini üstlenecek diye springe bilgi veriyoruz.
public class JobTitlesManager implements JobTİtlesService {

	private JobTitlesDao jobTitlesDao;
	
	@Autowired // Spring arka planda buna karşılık gelebilecek(projede
	//JobTitlesDao'nun insteance'ı(örneği) olabilecek bir tane sınıfı üretiyor. 
	public JobTitlesManager(JobTitlesDao jobTitlesDao) {
		super();
		this.jobTitlesDao = jobTitlesDao;
	}


	@Override
	public DataResult<List<JobTitles>> getAll() {
		
		return new SuccessDataResult<List<JobTitles>>(this.jobTitlesDao.findAll(),"Data listelendi.");
	}


	@Override
	public Result add(JobTitles jobtitles) {
		this.jobTitlesDao.save(jobtitles);
		return new SuccessResult("Başarılı bir şekilde eklendi");
	}

}
