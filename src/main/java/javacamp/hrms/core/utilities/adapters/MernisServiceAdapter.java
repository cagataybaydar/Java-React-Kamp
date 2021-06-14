package javacamp.hrms.core.utilities.adapters;

import javacamp.hrms.entities.concretes.FakeMernisService;

public class MernisServiceAdapter implements ValidationService {

	@Override
	public boolean validateByMernis(long nationality_Id, String first_name, String last_name, int birth_year) {
	FakeMernisService client = new FakeMernisService();
		
		boolean result = true;
		try {
			result = client.ValidateByPersonalInfo(nationality_Id, first_name, last_name, birth_year);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
