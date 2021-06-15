package javacamp.hrms.business.concretes;

import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.VerificationCodeService;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracts.VerificationCodesDao;
import javacamp.hrms.entities.concretes.VerificationCodes;

@Service
public class VerificationCodeManager implements VerificationCodeService {
	
	private VerificationCodesDao verificationCodesDao;

	public VerificationCodeManager(VerificationCodesDao verificationCodesDao) {
		super();
		this.verificationCodesDao = verificationCodesDao;
	}

	@Override
	public Result add(VerificationCodes code) {
		this.verificationCodesDao.save(code);
		return new SuccessResult("Kod kaydedildi");
	}
	
	
}
