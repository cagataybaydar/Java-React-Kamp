package Homework5.business.abstracts;

public interface VerificationService {
	boolean firstNameControl(String message);
	boolean lastNameControl(String message);
	boolean emailControl(String message);
	boolean passwordControl(String message);
	
}
