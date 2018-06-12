package co.edu.udea.wi.bl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.wi.bl.RequestBl;
import co.edu.udea.wi.dao.RequestDao;
import co.edu.udea.wi.dto.Customer;
import co.edu.udea.wi.dto.Request;
import co.edu.udea.wi.exception.ClassException;
import co.edu.udea.wi.validations.Validations;

@Transactional
public class RequestBlImpl implements RequestBl {

	private Validations validations;
	
	@Autowired
	private RequestDao requestDao;
	
	public RequestBlImpl() {

		validations = new Validations();
	}

	@Override
	public void create(Request request) throws Exception {
		
		List<String> errors = validations.validateRequest(request);
		
		if (errors.size() == 0) {
			
			requestDao.add(request);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public void update(Request request) throws Exception {
		
		List<String> errors = validations.validateRequest(request);
		
		if (errors.size() == 0) {
			
			requestDao.update(request);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public void delete(Request request) throws Exception {
		
		List<String> errors = validations.validateRequest(request);
		
		if (errors.size() == 0) {
			
			requestDao.add(request);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public List<Request> getRequests() throws Exception {

		return requestDao.getRequests();
	}

	@Override
	public Request getRequestById(int id) throws Exception {
		
		return requestDao.getRequestById(id);
	}

	@Override
	public List<Request> getRequestByCustomer(Customer customer) throws Exception {
		
		List<String> errors = validations.validateCustomer(customer);
		
		if (errors.size() == 0) {
			
			return requestDao.getRequestByCustomer(customer);
		} else {
			throw new ClassException();
		}
	}

}
