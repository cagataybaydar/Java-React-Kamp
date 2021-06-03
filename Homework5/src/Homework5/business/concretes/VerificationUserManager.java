package Homework5.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Homework5.business.abstracts.VerificationService;
import Homework5.entities.concretes.User;



public class VerificationUserManager implements VerificationService {
	
	public List<User> users = new ArrayList<User>();
	String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
	
	
	@Override
	public boolean firstNameControl(String firstname) {
		if (firstname.length() > 2) {
			return true;
		} else {
			System.out.println("Adýnýz en az iki karakterden oluþmalýdýr.");
			return false;
		}
	}

	@Override
	public boolean lastNameControl(String lastname) {
		if (lastname.length() > 2) {
			return true;
		} else {
			System.out.println("Soyadýnýz en az iki karakterden oluþmalýdýr.");
			return false;
		}
	}

	@Override
	public boolean emailControl(String email) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		if(!matcher.matches()) {
			System.out.println("Girdiðiniz email yanlýþ,lütfen uygun bir email giriniz");
			return false;
		}
		else {
			return true;
		}
		
	}

	@Override
	public boolean passwordControl(String password) {
		if (password.length() >= 6) {
			return true;
		}
		else {
			System.out.println("Girebileceðiniz parola en az 6 karakterden oluþmalýdýr.");
			return false;
		}
	}

}
