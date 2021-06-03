package Homework5.core.concretes;

import Homework5.Google.GoogleService;
import Homework5.core.abstracts.SignUpService;
import Homework5.entities.concretes.User;

public class GoogleManager implements SignUpService {

	@Override
	public void signUp(User user) {
		GoogleService googleService = new GoogleService();
		googleService.signUp(user.getEmail());
	}

}
