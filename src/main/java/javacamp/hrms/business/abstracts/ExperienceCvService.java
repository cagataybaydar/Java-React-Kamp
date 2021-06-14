package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.ExperienceCv;

public interface ExperienceCvService {
	Result add(ExperienceCv experienceCv);
	Result update(ExperienceCv experienceCv);
	Result delete(int id);
	DataResult<ExperienceCv> getById(int id);
	DataResult<List<ExperienceCv>> getAll();
	DataResult<List<ExperienceCv>> getAllByCandidateIdOrderByEndAtDesc(int id);
	DataResult<List<ExperienceCv>> getAllByCandidateId(int id);
}
