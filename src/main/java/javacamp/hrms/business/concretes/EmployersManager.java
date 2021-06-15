package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.EmployersService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.EmployersDao;
import javacamp.hrms.entities.concretes.Employers;

@Service
public class EmployersManager implements EmployersService {

	private EmployersDao employersDao;
	
	@Autowired
	public EmployersManager(EmployersDao employersDao) {
		this.employersDao = employersDao;
	}
	
	@Override
	public Result add(Employers employers) {
		this.employersDao.save(employers);
		return new SuccessResult();
	}

	@Override
	public DataResult<List<Employers>> getAll() {
		this.employersDao.findAll();
		return new SuccessDataResult<List<Employers>>("Data listelendi.");
	}

}
