package co.edu.udea.wi.bl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.udea.wi.bl.RequestStateBl;
import co.edu.udea.wi.dao.RequestStateDao;
import co.edu.udea.wi.dto.RequestState;
import co.edu.udea.wi.exception.ClassException;
import co.edu.udea.wi.validations.Validations;

public class RequestStateBlImpl implements RequestStateBl {

	private Validations validations;
	private RequestStateDao dao;
	
	public RequestStateBlImpl() {
		
		validations = new Validations();
	}
	
	public RequestStateDao getDao() {
		return dao;
	}

	public void setDao(RequestStateDao dao) {
		this.dao = dao;
	}
	
	@Override
	public void create(RequestState requestState) throws Exception {
		
		List<String> errors = validations.validateRequestState(requestState);
		
		if (errors.size() == 0) {
			
			dao.add(requestState);
		} else {
			throw new ClassException(errors);
		}
	}

	@Override
	public void update(RequestState requestState) throws Exception {
		
		List<String> errors = validations.validateRequestState(requestState);
		
		if (errors.size() == 0) {
			
			dao.update(requestState);
		} else {
			throw new ClassException(errors);
		}
	}

	@Override
	public void delete(RequestState requestState) throws Exception {
		
		List<String> errors = validations.validateRequestState(requestState);
		
		if (errors.size() == 0) {
			
			dao.delete(requestState);
		} else {
			throw new ClassException(errors);
		}
	}

	@Override
	public List<RequestState> getRequestStates() throws Exception {

		return dao.getRequestStates();
	}

	@Override
	public RequestState getRequestStateById(int id) throws Exception {
		
		return dao.getRequestStateById(id);
	}

}
