package Homework5.dataAccess.abstracts;

import java.util.List;

import Homework5.entities.concretes.User;

public interface UserDao {
	void add(User user);	
	User get(int id);
	List<User> getAll();
}
