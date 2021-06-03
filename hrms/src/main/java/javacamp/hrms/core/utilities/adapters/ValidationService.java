package javacamp.hrms.core.utilities.adapters;

import java.util.Date;

public interface ValidationService {
	boolean validateByMernis(String nationality_Id, String first_name, String last_name, Date birth_year);
}
