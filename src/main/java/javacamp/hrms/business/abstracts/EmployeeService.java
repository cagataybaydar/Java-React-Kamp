package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.entities.concretes.Employees;

public interface EmployeeService {
	DataResult<List<Employees>> getAll();
}
