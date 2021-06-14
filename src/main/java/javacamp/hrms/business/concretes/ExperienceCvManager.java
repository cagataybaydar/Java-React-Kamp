package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.ExperienceCvService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.ExperienceCvDao;
import javacamp.hrms.entities.concretes.ExperienceCv;

@Service
public class ExperienceCvManager implements ExperienceCvService {

	private ExperienceCvDao experienceCvDao;
	
	public ExperienceCvManager(ExperienceCvDao experienceCvDao) {
		super();
		this.experienceCvDao = experienceCvDao;
	}

	@Override
	public Result add(ExperienceCv experienceCv) {
		this.experienceCvDao.save(experienceCv);
		return new SuccessResult("Deneyim bilgisi eklendi");
	}

	@Override
	public Result update(ExperienceCv experienceCv) {
		this.experienceCvDao.save(experienceCv);
		return new SuccessResult("Deneyim bilgisi güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.experienceCvDao.deleteById(id);
		return new SuccessResult("Deneyim bilgisi silindi");
	}

	@Override
	public DataResult<List<ExperienceCv>> getAll() {
		this.experienceCvDao.findAll();
		return new SuccessDataResult<List<ExperienceCv>>("Data listelendi");
	}

	@Override
	public DataResult<List<ExperienceCv>> getAllByCandidateIdOrderByEndAtDesc(int id) {
		this.experienceCvDao.getAllByCandidates_IdOrderByEndAtDesc(id);
		return new SuccessDataResult<List<ExperienceCv>>("Data listelendi");
	}

	@Override
	public DataResult<List<ExperienceCv>> getAllByCandidateId(int id) {
		this.experienceCvDao.getAllByCandidates_Id(id);
		return new SuccessDataResult<List<ExperienceCv>>("Data listelendi");
	}

	@Override
	public DataResult<ExperienceCv> getById(int id) {
		this.experienceCvDao.getById(id);
		return new SuccessDataResult<ExperienceCv>("Data listelendi");
	}

}
