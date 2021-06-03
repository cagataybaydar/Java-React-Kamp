package Homework4.Abstracts;

import Homework4.Entities.Customer;

public interface CustomerService {
	public void add(Customer customer);
	public void update(Customer customer);
	public void delete(Customer customer);
}
