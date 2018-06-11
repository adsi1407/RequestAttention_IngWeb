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
	private RequestTypeDao requestTypeDao;

	public RequestTypeBlImpl() {
		
		validations = new Validations();
	}

	public RequestTypeDao getRequestTypeDao() {
		return requestTypeDao;
	}

	public void setRequestTypeDao(RequestTypeDao requestTypeDao) {
		this.requestTypeDao = requestTypeDao;
	}

	@Override
	public void create(RequestType requestType) throws Exception {
		
		List<String> errors = validations.validateRequestType(requestType);
		
		if (errors.size() == 0) {
			
			requestTypeDao.add(requestType);
		} else {
			throw new ClassException(errors);
		}
	}

	@Override
	public void update(RequestType requestType) throws Exception {
		
		List<String> errors = validations.validateRequestType(requestType);
		
		if (errors.size() == 0) {
			
			requestTypeDao.update(requestType);
		} else {
			throw new ClassException(errors);
		}
	}

	@Override
	public void delete(RequestType requestType) throws Exception {
		
		List<String> errors = validations.validateRequestType(requestType);
		
		if (errors.size() == 0) {
			
			requestTypeDao.delete(requestType);
		} else {
			throw new ClassException(errors);
		}
	}

	@Override
	public List<RequestType> getRequestTypes() throws Exception {
		
		return requestTypeDao.getRequestTypes();
	}

	@Override
	public RequestType getRequestTypeById(int id) throws Exception {

		return requestTypeDao.getRequestTypeById(id);
	}

}
