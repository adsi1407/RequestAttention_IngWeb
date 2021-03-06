package co.edu.udea.wi.bl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.wi.bl.RequestStateBl;
import co.edu.udea.wi.dao.RequestStateDao;
import co.edu.udea.wi.dto.RequestState;
import co.edu.udea.wi.exception.ClassException;
import co.edu.udea.wi.validations.Validations;

@Transactional
public class RequestStateBlImpl implements RequestStateBl {

	private Validations validations;
	
	@Autowired
	private RequestStateDao requestStateDao;
	
	public RequestStateBlImpl() {
		
		validations = new Validations();
	}

	@Override
	public void create(RequestState requestState) throws Exception {
		
		List<String> errors = validations.validateRequestState(requestState);
		
		if (errors.size() == 0) {
			
			requestStateDao.add(requestState);
		} else {
			throw new ClassException(errors);
		}
	}

	@Override
	public void update(RequestState requestState) throws Exception {
		
		List<String> errors = validations.validateRequestState(requestState);
		
		if (errors.size() == 0) {
			
			requestStateDao.update(requestState);
		} else {
			throw new ClassException(errors);
		}
	}

	@Override
	public void delete(RequestState requestState) throws Exception {
		
		List<String> errors = validations.validateRequestState(requestState);
		
		if (errors.size() == 0) {
			
			requestStateDao.delete(requestState);
		} else {
			throw new ClassException(errors);
		}
	}

	@Override
	public List<RequestState> getRequestStates() throws Exception {

		return requestStateDao.getRequestStates();
	}

	@Override
	public RequestState getRequestStateById(int id) throws Exception {
		
		return requestStateDao.getRequestStateById(id);
	}

}
