package Homework4.Concretes;

import Homework4.Abstracts.CustomerCheckService;
import Homework4.Abstracts.CustomerService;
import Homework4.Entities.Customer;

public class CustomerManager implements CustomerService{

	private CustomerCheckService customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + 
				" " + "isimli oyuncu eklendi");
		
	}
	
	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + 
				" " + "isimli oyuncu güncellendi");
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + 
				" " + "isimli oyuncu silindi.");
	}



	
	
}
