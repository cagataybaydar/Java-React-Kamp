package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.ProgrammingSkillCvService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.ProgrammingSkillCvDao;
import javacamp.hrms.entities.concretes.ProgrammingSkillCv;

@Service
public class ProgrammingSkillCvManager implements ProgrammingSkillCvService {
	
	private ProgrammingSkillCvDao programmingSkillCvDao;

	public ProgrammingSkillCvManager(ProgrammingSkillCvDao programmingSkillCvDao) {
		super();
		this.programmingSkillCvDao = programmingSkillCvDao;
	}

	@Override
	public Result add(ProgrammingSkillCv programmingSkillCv) {
		this.programmingSkillCvDao.save(programmingSkillCv);
		return new SuccessResult("Programlama becerisi eklendi");
	}

	@Override
	public Result update(ProgrammingSkillCv programmingSkillCv) {
		this.programmingSkillCvDao.save(programmingSkillCv);
		return new SuccessResult("Programlama becerisi güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.programmingSkillCvDao.deleteById(id);
		return new SuccessResult("Programlama becerisi silindi");
	}

	@Override
	public DataResult<ProgrammingSkillCv> getById(int id) {
		this.programmingSkillCvDao.getById(id);
		return new SuccessDataResult<ProgrammingSkillCv>("Data listelendi");
	}

	@Override
	public DataResult<List<ProgrammingSkillCv>> getAll() {
		this.programmingSkillCvDao.findAll();
		return new SuccessDataResult<List<ProgrammingSkillCv>>("Data listelendi");
	}

	@Override
	public DataResult<List<ProgrammingSkillCv>> getAllByCandidateId(int id) {
		this.programmingSkillCvDao.getAllByCandidates_Id(id);
		return new SuccessDataResult<List<ProgrammingSkillCv>>("Data listelendi");
	}
	
	
}
