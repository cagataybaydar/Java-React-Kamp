package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.Employers;

public interface EmployersService {
	Result add(Employers employers);
	
	DataResult<List<Employers>> getAll();
}
