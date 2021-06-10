package javacamp.hrms.entities.concretes;

import java.util.Date;

public class FakeMernisService {
	public boolean ValidateByPersonalInfo(String nationality_Id, String first_name, String last_name, Date birth_year)
	{
		System.out.println(first_name + " " + last_name + " is valid person." );
		return true;
	}
}
