package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.ForeignLanguageCvService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.ForeignLanguageCvDao;
import javacamp.hrms.entities.concretes.ForeignLanguageCv;

@Service
public class ForeignLanguageCvManager implements ForeignLanguageCvService {
	
	private ForeignLanguageCvDao foreignLanguageCvDao;

	public ForeignLanguageCvManager(ForeignLanguageCvDao foreignLanguageCvDao) {
		super();
		this.foreignLanguageCvDao = foreignLanguageCvDao;
	}

	@Override
	public Result add(ForeignLanguageCv foreignLanguageCv) {
		this.foreignLanguageCvDao.save(foreignLanguageCv);
		return new SuccessResult("Yabancı dil bilgisi eklendi");
	}

	@Override
	public Result update(ForeignLanguageCv foreignLanguageCv) {
		this.foreignLanguageCvDao.save(foreignLanguageCv);
		return new SuccessResult("Yabancı dil bilgisi güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.foreignLanguageCvDao.deleteById(id);
		return new SuccessResult("Yabancı dil bilgisi silindi");
	}

	@Override
	public DataResult<ForeignLanguageCv> getById(int id) {
		this.foreignLanguageCvDao.getById(id);
		return new SuccessDataResult<ForeignLanguageCv>("Data listelendi");
	}

	@Override
	public DataResult<List<ForeignLanguageCv>> getAll() {
		this.foreignLanguageCvDao.findAll();
		return new SuccessDataResult<List<ForeignLanguageCv>>("Data listelendi");
	}

	@Override
	public DataResult<List<ForeignLanguageCv>> getAllByCandidateId(int id) {
		this.foreignLanguageCvDao.getAllByCandidates_Id(id);
		return new SuccessDataResult<List<ForeignLanguageCv>>("Data listelendi");
	}
}
