package javacamp.hrms.business.abstracts;

import java.util.List;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertService {
	Result add(JobAdvertisement jobAdvertisement);
	
	Result update(JobAdvertisement jobAdvertisement);
	
	Result delete(int id);
	
	Result changeActivityStatus(int id);
	
	DataResult<List<JobAdvertisement>> getAll();
	
	DataResult<List<JobAdvertisement>> getAllActiveJobAdvertList();
	
	DataResult<List<JobAdvertisement>> getAllActiveJobAdvertByEmployer(int id);

	DataResult<List<JobAdvertisement>> getAllByOrderByPublishedAt();

	DataResult<JobAdvertisement> getById(int jobAdvertId);
	
}
