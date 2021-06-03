package Homework5;

import Homework5.business.abstracts.UserService;
import Homework5.business.concretes.UserManager;
import Homework5.business.concretes.VerificationUserManager;
import Homework5.core.concretes.MainAdapter;
import Homework5.dataAccess.concretes.HibernateUserDao;
import Homework5.entities.concretes.User;

public class Main {
	public static void main(String[] args) {
	User Cagatay = new User(1,"Çaðatay","Baydar","cagataybaydar59@hotmail.com","123456");
	UserService userService = new UserManager(new VerificationUserManager(),new HibernateUserDao(),
			new MainAdapter());
	userService.signUp(Cagatay);
	userService.signIn(Cagatay.getEmail(), Cagatay.getPassword());
	
	
	
	
	}
}
