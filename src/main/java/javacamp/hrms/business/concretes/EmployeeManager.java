package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.EmployeeService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.dataAccess.abstracts.EmployeesDao;
import javacamp.hrms.entities.concretes.Employees;

@Service
public class EmployeeManager implements EmployeeService {

	private EmployeesDao employeesDao;
	
	public EmployeeManager(EmployeesDao employeesDao) {
		super();
		this.employeesDao= employeesDao;
	}

	@Override
	public DataResult<List<Employees>> getAll() {
		this.employeesDao.findAll();
		return new SuccessDataResult<List<Employees>>("Data listelendi");
	}

}
