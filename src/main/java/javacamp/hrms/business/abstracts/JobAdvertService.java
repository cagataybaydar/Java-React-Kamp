package javacamp.hrms.business.abstracts;

import java.util.Date;
import java.util.List;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertService {
	Result add(JobAdvertisement jobAdvertisement);
	
	Result update(JobAdvertisement jobAdvertisement);
	
	Result delete(int id);
	
	Result changeActivityStatus(int id);
	
	DataResult<List<JobAdvertisement>> getAllByIsActive(boolean isActive);
	
	DataResult<List<JobAdvertisement>> getByIsActiveAndEmployer_Id(boolean isActive, int employerId);

	DataResult<List<JobAdvertisement>> getByIsActiveAndDeadLine(boolean isActive, Date deadLine);

	DataResult<JobAdvertisement> getById(int jobAdvertId);
	
}
