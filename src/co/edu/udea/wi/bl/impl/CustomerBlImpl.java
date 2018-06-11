package co.edu.udea.wi.bl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.udea.wi.bl.CustomerBl;
import co.edu.udea.wi.dao.CustomerDao;
import co.edu.udea.wi.dto.Customer;
import co.edu.udea.wi.exception.ClassException;
import co.edu.udea.wi.validations.Validations;

public class CustomerBlImpl implements CustomerBl {

	private Validations validations;
	
	@Autowired
	private CustomerDao dao;
	
	public CustomerBlImpl() {

		validations = new Validations();
	}
	
	@Override
	public void create(Customer customer) throws Exception {
		
		List<String> errors = validations.validateCustomer(customer);
		
		if (errors.size() == 0) {
			
			dao.add(customer);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public void update(Customer customer) throws Exception {
		
		List<String> errors = validations.validateCustomer(customer);
		
		if (errors.size() == 0) {
			
			dao.update(customer);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public void delete(Customer customer) throws Exception {
		
		List<String> errors = validations.validateCustomer(customer);
		
		if (errors.size() == 0) {
			
			dao.delete(customer);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public List<Customer> getCustomers() throws Exception {
		
		return dao.getCustomers();
	}

	@Override
	public Customer getCustomerById(String id) throws Exception {

		return dao.getCustomerById(id);
	}

}
