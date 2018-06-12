package co.edu.udea.wi.bl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.wi.bl.CustomerBl;
import co.edu.udea.wi.dao.CustomerDao;
import co.edu.udea.wi.dto.Customer;
import co.edu.udea.wi.exception.ClassException;
import co.edu.udea.wi.validations.Validations;

@Transactional
public class CustomerBlImpl implements CustomerBl {

	private Validations validations;
	
	@Autowired
	private CustomerDao customerDao;
	
	public CustomerBlImpl() {

		validations = new Validations();
	}

	@Override
	public void create(Customer customer) throws Exception {
		
		List<String> errors = validations.validateCustomer(customer);
		
		if (errors.size() == 0) {
			
			customerDao.add(customer);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public void update(Customer customer) throws Exception {
		
		List<String> errors = validations.validateCustomer(customer);
		
		if (errors.size() == 0) {
			
			customerDao.update(customer);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public void delete(Customer customer) throws Exception {
		
		List<String> errors = validations.validateCustomer(customer);
		
		if (errors.size() == 0) {
			
			customerDao.delete(customer);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public List<Customer> getCustomers() throws Exception {
		
		return customerDao.getCustomers();
	}

	@Override
	public Customer getCustomerById(String id) throws Exception {

		return customerDao.getCustomerById(id);
	}

}
