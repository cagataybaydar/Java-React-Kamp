package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.CoverLetterCv;

public interface CoverLetterCvService {
	Result add(CoverLetterCv coverLetterCv);
	Result update(CoverLetterCv coverLetterCv);
	Result delete(int id);
	DataResult<CoverLetterCv> getById(int id);
	DataResult<List<CoverLetterCv>> getAll();
}
