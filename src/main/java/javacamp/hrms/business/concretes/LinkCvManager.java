package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.LinkCvService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.LinkCvDao;
import javacamp.hrms.entities.concretes.LinkCv;

@Service
public class LinkCvManager implements LinkCvService{
	
	private LinkCvDao linkCvDao;

	public LinkCvManager(LinkCvDao linkCvDao) {
		super();
		this.linkCvDao = linkCvDao;
	}

	@Override
	public Result add(LinkCv linkCv) {
		this.linkCvDao.save(linkCv);
		return new SuccessResult("Bağlantı eklendi");
	}

	@Override
	public Result update(LinkCv linkCv) {
		this.linkCvDao.save(linkCv);
		return new SuccessResult("Bağlantı güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.linkCvDao.deleteById(id);
		return new SuccessResult("Bağlantı silindi");
	}

	@Override
	public DataResult<LinkCv> getById(int id) {
		this.linkCvDao.getById(id);
		return new SuccessDataResult<LinkCv>("Data listelendi");
	}

	@Override
	public DataResult<List<LinkCv>> getAll() {
		this.linkCvDao.findAll();
		return new SuccessDataResult<List<LinkCv>>("Data listelendi");
	}

	@Override
	public DataResult<List<LinkCv>> getAllByCandidateId(int id) {
		this.linkCvDao.getAllByCandidates_Id(id);
		return new SuccessDataResult<List<LinkCv>>("Data listelendi");
	}
	
	
	
}
