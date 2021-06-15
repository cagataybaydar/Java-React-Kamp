package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.CoverLetterCvService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.CoverLetterCvDao;
import javacamp.hrms.entities.concretes.CoverLetterCv;

@Service
public class CoverLetterCvManager implements CoverLetterCvService {

	private CoverLetterCvDao coverLetterCvDao;
	
	public CoverLetterCvManager(CoverLetterCvDao coverLetterCvDao) {
		super();
		this.coverLetterCvDao = coverLetterCvDao;
	}

	@Override
	public Result add(CoverLetterCv coverLetterCv) {
		this.coverLetterCvDao.save(coverLetterCv);
		return new SuccessResult("Ön yazı eklendi");
	}

	@Override
	public Result update(CoverLetterCv coverLetterCv) {
		this.coverLetterCvDao.save(coverLetterCv);
		return new SuccessResult("Ön yazı güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.coverLetterCvDao.deleteById(id);
		return new SuccessResult("Ön yazı silindi");
	}

	@Override
	public DataResult<CoverLetterCv> getById(int id) {
		this.coverLetterCvDao.getById(id);
		return new SuccessDataResult<CoverLetterCv>("Data id etiketli ile listelendi");
	}

	@Override
	public DataResult<List<CoverLetterCv>> getAll() {
		this.coverLetterCvDao.findAll();
		return new SuccessDataResult<List<CoverLetterCv>>("Data listelendi");
	}

}
