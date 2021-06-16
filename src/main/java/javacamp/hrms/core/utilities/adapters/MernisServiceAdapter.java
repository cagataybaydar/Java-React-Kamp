package javacamp.hrms.core.utilities.adapters;

import org.springframework.stereotype.Component;

import javacamp.hrms.entities.concretes.FakeMernisService;

@Component
public class MernisServiceAdapter implements ValidationService {

	@Override
	public boolean validateByMernis(long nationalityId, String firstName, String lastName, int birthYear) {
		
		FakeMernisService client = new FakeMernisService();
		
		boolean result = true;
		try {
			result = client.ValidateByPersonalInfo(nationalityId, firstName, lastName, birthYear);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
