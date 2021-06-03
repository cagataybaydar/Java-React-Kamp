package Homework4.Adapters;

import Homework4.Abstracts.CustomerCheckService;
import Homework4.Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		System.out.println(customer.getFirstName() + customer.getLastName() + 
				customer.getNationalityId() + customer.getDateOfBirth() + ":" + "Doðrulandý.");
		return false;
	}

}
