package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.JobTitles;

public interface JobTİtlesService {
	Result add(JobTitles jobtitles);
	
	DataResult<List<JobTitles>> getAll();
	
	DataResult<JobTitles> getJobByTitle(String title);
}
