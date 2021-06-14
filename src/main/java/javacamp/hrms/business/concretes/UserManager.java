package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.UserService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.UsersDao;
import javacamp.hrms.entities.concretes.Users;

@Service
public class UserManager implements UserService{
	private UsersDao userDao;

	public UserManager(UsersDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(Users users) {
		this.userDao.save(users);
		return new SuccessResult("Kullanıcı eklendi");
	}

	@Override
	public DataResult<List<Users>> getAll() {
		this.userDao.findAll();
		return new SuccessDataResult<List<Users>>("Data listelendi");
	}

	@Override
	public DataResult<Users> getUserByEmail(String email) {
		this.userDao.findUserByEMail(email);
		return new SuccessDataResult<Users>("Data listelendi");
	}
	
	
}
