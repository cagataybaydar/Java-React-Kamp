package Homework5.business.abstracts;

import Homework5.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void signIn(String email,String password);

}
