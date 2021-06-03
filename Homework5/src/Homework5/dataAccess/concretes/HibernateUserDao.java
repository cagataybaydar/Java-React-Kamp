package Homework5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Homework5.dataAccess.abstracts.UserDao;
import Homework5.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	private List<User> users;
	
	
	public HibernateUserDao() {
		super();
		this.users = new ArrayList<User>();
	}

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi : " + user.getFirstName() );
		users.add(user);
		System.out.println("Kullanýcý baþarýlý bir þekilde eklendi : " + user.getEmail());
	}
	
	

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.users;
	}

	

}
