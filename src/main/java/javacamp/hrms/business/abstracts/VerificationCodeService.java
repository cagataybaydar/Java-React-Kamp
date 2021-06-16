package javacamp.hrms.business.abstracts;

import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.VerificationCodes;

public interface VerificationCodeService {
	Result add(VerificationCodes code);
}
