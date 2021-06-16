package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.Users;

public interface UserService {
	Result add(Users users);
	
	DataResult<List<Users>> getAll();
	DataResult<Users> getUserByEmail(String email);
}
