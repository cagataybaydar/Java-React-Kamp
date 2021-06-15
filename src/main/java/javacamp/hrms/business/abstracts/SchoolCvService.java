package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.SchoolCv;

public interface SchoolCvService {
	Result add(SchoolCv schoolCv);
	Result update(SchoolCv schoolCv);
	Result delete(int id);
	DataResult<SchoolCv> getById(int id);	
	DataResult<List<SchoolCv>> getAll();
	DataResult<List<SchoolCv>> getAllByCandidateIdOrderByEndAtDesc(int id);
	DataResult<List<SchoolCv>> getAllByCandidateId(int id);
}
