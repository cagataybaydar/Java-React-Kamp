package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.Candidates;

public interface CandidatesService {
	Result add(Candidates candidates);
	
	DataResult<List<Candidates>> getAll();
}
