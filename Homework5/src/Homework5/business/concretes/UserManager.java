package Homework5.business.concretes;

import Homework5.business.abstracts.UserService;
import Homework5.business.abstracts.VerificationService;
import Homework5.core.abstracts.SignUpService;
import Homework5.dataAccess.abstracts.UserDao;
import Homework5.entities.concretes.User;

public class UserManager implements UserService {

	private VerificationService verificationService;
	private UserDao userDao;
	private SignUpService signUpService;

	public UserManager(VerificationService verificationService, UserDao userDao, SignUpService signUpService) {
		super();
		this.verificationService = verificationService;
		this.userDao = userDao;
		this.signUpService = signUpService;
	}

	@Override
	public void signUp(User user) {
		if (verificationService.emailControl(user.getEmail())
				&& verificationService.firstNameControl(user.getFirstName())
				&& verificationService.lastNameControl(user.getLastName())
				&& verificationService.passwordControl(user.getPassword())) {
			userDao.add(user);
			signUpService.signUp(user);
			System.out.println("Baþarýlý bir þekilde kayýt olundu : " + user.getFirstName());

			System.out.println("Email doðrulamasý tarafýnýza gönderilmiþtir." + user.getEmail());

		}

	}

	@Override
	public void signIn(String email, String password) {
		for (int i = 0; i < userDao.getAll().size(); i++) {
			if (userDao.getAll().get(i).getEmail().equals(email)
					&& userDao.getAll().get(i).getPassword().equals(password)) {
				System.out.println("Baþarýlý bir þekilde giriþ yaptýnýz!");
				return;
			}

			System.out.println("Giriþ bilgilerini kontrol et");
		}
	}

}
