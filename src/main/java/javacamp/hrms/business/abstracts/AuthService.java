package javacamp.hrms.business.abstracts;

import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.Candidates;
import javacamp.hrms.entities.concretes.Employers;

public interface AuthService {
	Result registerEmployer(Employers employers,String confirmPassword);
	Result registerCandidates(Candidates candidates,String confirmPassword);
}
