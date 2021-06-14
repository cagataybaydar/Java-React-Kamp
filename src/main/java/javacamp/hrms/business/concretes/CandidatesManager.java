package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.CandidatesService;
import javacamp.hrms.business.abstracts.ExperienceCvService;
import javacamp.hrms.business.abstracts.ForeignLanguageCvService;
import javacamp.hrms.business.abstracts.ImageCvService;
import javacamp.hrms.business.abstracts.LinkCvService;
import javacamp.hrms.business.abstracts.ProgrammingSkillCvService;
import javacamp.hrms.business.abstracts.SchoolCvService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.CandidatesDao;
import javacamp.hrms.entities.concretes.Candidates;
import javacamp.hrms.entities.dtos.CandidateCvDto;

@Service
public class CandidatesManager implements CandidatesService{
	
	private CandidatesDao candidatesDao;
	private ExperienceCvService experienceCvService;
	private ForeignLanguageCvService foreignLanguageCvService;
	private ImageCvService imageCvService;
	private LinkCvService linkCvService;
	private ProgrammingSkillCvService programmingSkillCvService;
	private SchoolCvService schoolCvService;
	
	@Autowired
	public CandidatesManager
	(CandidatesDao candidatesDao,ExperienceCvService experienceCvService,
			ForeignLanguageCvService foreignLanguageCvService,
			ImageCvService imageCvService,LinkCvService linkCvService,
			ProgrammingSkillCvService programmingSkillCvService,
			SchoolCvService schoolCvService) {
		super();
		this.candidatesDao = candidatesDao;
		this.experienceCvService = experienceCvService;
		this.foreignLanguageCvService = foreignLanguageCvService;
		this.imageCvService = imageCvService;
		this.programmingSkillCvService = programmingSkillCvService;
		this.schoolCvService = schoolCvService;
	}

	@Override
	public Result add(Candidates candidates) {
		this.candidatesDao.save(candidates);
		return new SuccessResult("Aday eklendi");
	}

	@Override
	public DataResult<List<Candidates>> getAll() {
		return new SuccessDataResult<List<Candidates>>
		(this.candidatesDao.findAll(), "Data listelendi");
	}

	@Override
	public Result update(Candidates candidates) {
		this.candidatesDao.save(candidates);
		return new SuccessResult("Aday güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.candidatesDao.deleteById(id);
		return new SuccessResult("Aday silindi");
	}

	@Override
	public DataResult<Candidates> getById(int id) {
		this.candidatesDao.getById(id);
		return new SuccessDataResult<Candidates>();
	}

	@Override
	public DataResult<Candidates> getCandidateByNationalityId(String nationalityId) {
		return new SuccessDataResult<Candidates>
		(this.candidatesDao.findCandidateByNationalityId(nationalityId));
	}

	@Override
	public DataResult<CandidateCvDto> getCandidateCvById(int id) {
		Candidates candidates = this.candidatesDao.getById(id);
		CandidateCvDto cv = new CandidateCvDto();
		cv.experiences = candidates.getExperiences();
		cv.languages = candidates.getLanguages();
		cv.image = candidates.getImage();
		cv.links = candidates.getLinks();
		cv.programmingSkills = candidates.getProgramingSkills();
		cv.schools = candidates.getSchools();		
		return new SuccessDataResult<CandidateCvDto>(cv);
	}
	
	
}
