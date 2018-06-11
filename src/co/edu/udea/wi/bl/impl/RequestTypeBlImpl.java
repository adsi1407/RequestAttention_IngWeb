package co.edu.udea.wi.bl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.udea.wi.bl.RequestTypeBl;
import co.edu.udea.wi.dao.RequestTypeDao;
import co.edu.udea.wi.dto.RequestType;
import co.edu.udea.wi.exception.ClassException;
import co.edu.udea.wi.validations.Validations;

public class RequestTypeBlImpl implements RequestTypeBl {
	
	private Validations validations;
	private RequestTypeDao dao;

	public RequestTypeBlImpl() {
		
		validations = new Validations();
	}
	
	public RequestTypeDao getDao() {
		return dao;
	}

	public void setDao(RequestTypeDao dao) {
		this.dao = dao;
	}

	@Override
	public void create(RequestType requestType) throws Exception {
		
		List<String> errors = validations.validateRequestType(requestType);
		
		if (errors.size() == 0) {
			
			dao.add(requestType);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public void update(RequestType requestType) throws Exception {
		
		List<String> errors = validations.validateRequestType(requestType);
		
		if (errors.size() == 0) {
			
			dao.update(requestType);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public void delete(RequestType requestType) throws Exception {
		
		List<String> errors = validations.validateRequestType(requestType);
		
		if (errors.size() == 0) {
			
			dao.delete(requestType);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public List<RequestType> getRequestTypes() throws Exception {
		
		return dao.getRequestTypes();
	}

	@Override
	public RequestType getRequestTypeById(int id) throws Exception {

		return dao.getRequestTypeById(id);
	}

}
