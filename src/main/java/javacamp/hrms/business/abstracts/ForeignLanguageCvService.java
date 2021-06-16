package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.ForeignLanguageCv;

public interface ForeignLanguageCvService {
	Result add(ForeignLanguageCv foreignLanguageCv);
	Result update(ForeignLanguageCv foreignLanguageCv);
	Result delete(int id);
	DataResult<ForeignLanguageCv> getById(int id);
	DataResult<List<ForeignLanguageCv>> getAll();
	DataResult<List<ForeignLanguageCv>> getAllByCandidateId(int id);
}
