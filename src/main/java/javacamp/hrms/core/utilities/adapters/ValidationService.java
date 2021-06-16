package javacamp.hrms.core.utilities.adapters;

public interface ValidationService {
	boolean validateByMernis(long nationalityId, String firstName, String lastName, int birthYear);
}
