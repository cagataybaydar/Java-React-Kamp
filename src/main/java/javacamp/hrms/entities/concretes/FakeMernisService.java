package javacamp.hrms.entities.concretes;

public class FakeMernisService {
	public boolean ValidateByPersonalInfo(long nationality_Id, String first_name, String last_name, int birth_year)
	{
		System.out.println(first_name + " " + last_name + " is valid person." );
		return true;
	}
}
