package co.edu.udea.wi.bl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.udea.wi.bl.AnswerBl;
import co.edu.udea.wi.dao.AnswerDao;
import co.edu.udea.wi.dto.Answer;
import co.edu.udea.wi.dto.Attendant;
import co.edu.udea.wi.dto.Request;
import co.edu.udea.wi.exception.ClassException;
import co.edu.udea.wi.validations.Validations;

public class AnswerBlImpl implements AnswerBl {

	private Validations validations;
	private AnswerDao dao;
	
	public AnswerBlImpl() {

		validations = new Validations();
	}
		
	public AnswerDao getDao() {
		return dao;
	}

	public void setDao(AnswerDao dao) {
		this.dao = dao;
	}

	@Override
	public void create(Answer answer) throws Exception {
		
		List<String> errors = validations.validateAnswer(answer);
		
		if (errors.size() == 0) {
			
			dao.add(answer);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public void update(Answer answer) throws Exception {
		
		List<String> errors = validations.validateAnswer(answer);
		
		if (errors.size() == 0) {
			
			dao.update(answer);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public void delete(Answer answer) throws Exception {
		
		List<String> errors = validations.validateAnswer(answer);
		
		if (errors.size() == 0) {
			
			dao.delete(answer);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public List<Answer> getAnswers() throws Exception {
		
		return dao.getAnswers();
	}

	@Override
	public Answer getAnswerById(int id) throws Exception {
		
		return dao.getAnswerById(id);
	}

	@Override
	public List<Answer> getAnswersByRequest(Request request) throws Exception {
		
		List<String> errors = validations.validateRequest(request);
		
		if (errors.size() == 0) {
			
			return dao.getAnswersByRequest(request);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public List<Answer> getAnswersByAttendant(Attendant attendant) throws Exception {
		
		List<String> errors = validations.validateAttendant(attendant);
		
		if (errors.size() == 0) {
			
			return dao.getAnswersByAttendant(attendant);
		} else {
			throw new ClassException();
		}
	}

}
