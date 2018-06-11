package co.edu.udea.wi.bl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.udea.wi.bl.RequestBl;
import co.edu.udea.wi.dao.RequestDao;
import co.edu.udea.wi.dto.Customer;
import co.edu.udea.wi.dto.Request;
import co.edu.udea.wi.exception.ClassException;
import co.edu.udea.wi.validations.Validations;

public class RequestBlImpl implements RequestBl {

	private Validations validations;
	private RequestDao dao;
	
	public RequestBlImpl() {

		validations = new Validations();
	}
	
	public RequestDao getDao() {
		return dao;
	}

	public void setDao(RequestDao dao) {
		this.dao = dao;
	}

	@Override
	public void create(Request request) throws Exception {
		
		List<String> errors = validations.validateRequest(request);
		
		if (errors.size() == 0) {
			
			dao.add(request);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public void update(Request request) throws Exception {
		
		List<String> errors = validations.validateRequest(request);
		
		if (errors.size() == 0) {
			
			dao.update(request);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public void delete(Request request) throws Exception {
		
		List<String> errors = validations.validateRequest(request);
		
		if (errors.size() == 0) {
			
			dao.add(request);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public List<Request> getRequests() throws Exception {

		return dao.getRequests();
	}

	@Override
	public Request getRequestById(int id) throws Exception {
		
		return dao.getRequestById(id);
	}

	@Override
	public List<Request> getRequestByCustomer(Customer customer) throws Exception {
		
		List<String> errors = validations.validateCustomer(customer);
		
		if (errors.size() == 0) {
			
			return dao.getRequestByCustomer(customer);
		} else {
			throw new ClassException();
		}
	}

}
