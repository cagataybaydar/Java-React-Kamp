package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.LinkCv;

public interface LinkCvService {
	Result add(LinkCv linkCv);
	Result update(LinkCv linkCv);
	Result delete(int id);
	DataResult<LinkCv> getById(int id);
	DataResult<List<LinkCv>> getAll();
	DataResult<List<LinkCv>> getAllByCandidateId(int id);
}
