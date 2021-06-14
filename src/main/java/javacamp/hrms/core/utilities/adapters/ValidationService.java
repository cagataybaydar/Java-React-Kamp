package javacamp.hrms.core.utilities.adapters;

public interface ValidationService {
	boolean validateByMernis(long nationality_Id, String first_name, String last_name, int birthYear);
}
