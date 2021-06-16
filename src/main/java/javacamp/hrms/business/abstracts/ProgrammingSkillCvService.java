package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.ProgrammingSkillCv;

public interface ProgrammingSkillCvService {
	Result add(ProgrammingSkillCv programmingSkillCv);
	Result update(ProgrammingSkillCv programmingSkillCv);
	Result delete(int id);
	DataResult<ProgrammingSkillCv> getById(int id);
	DataResult<List<ProgrammingSkillCv>> getAll();
	DataResult<List<ProgrammingSkillCv>> getAllByCandidateId(int id);
}
