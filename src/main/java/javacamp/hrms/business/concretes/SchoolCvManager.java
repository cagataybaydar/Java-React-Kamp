package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.SchoolCvService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.SchoolCvDao;
import javacamp.hrms.entities.concretes.SchoolCv;

@Service
public class SchoolCvManager implements SchoolCvService{
	
	private SchoolCvDao schoolCvDao;

	public SchoolCvManager(SchoolCvDao schoolCvDao) {
		super();
		this.schoolCvDao = schoolCvDao;
	}

	@Override
	public Result add(SchoolCv schoolCv) {
		this.schoolCvDao.save(schoolCv);
		return new SuccessResult("Okul eklendi");
	}

	@Override
	public Result update(SchoolCv schoolCv) {
		this.schoolCvDao.save(schoolCv);
		return new SuccessResult("Okul güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.schoolCvDao.deleteById(id);
		return new SuccessResult("Okul silindi");
	}

	@Override
	public DataResult<SchoolCv> getById(int id) {
		this.schoolCvDao.getById(id);
		return new SuccessDataResult<SchoolCv>("Data listelendi");
	}

	@Override
	public DataResult<List<SchoolCv>> getAll() {
		this.schoolCvDao.findAll();
		return new SuccessDataResult<List<SchoolCv>>("Data listelendi");
	}

	@Override
	public DataResult<List<SchoolCv>> getAllByCandidateIdOrderByEndAtDesc(int id) {
		this.schoolCvDao.getAllByCandidates_IdOrderByEndAtDesc(id);
		return new SuccessDataResult<List<SchoolCv>>("Data listelendi");
	}

	@Override
	public DataResult<List<SchoolCv>> getAllByCandidateId(int id) {
		this.schoolCvDao.getAllByCandidates_Id(id);
		return new SuccessDataResult<List<SchoolCv>>("Data listelendi");
	}
	
	
}
