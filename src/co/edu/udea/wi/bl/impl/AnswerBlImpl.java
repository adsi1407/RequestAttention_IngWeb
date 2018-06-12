package co.edu.udea.wi.bl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.wi.bl.AnswerBl;
import co.edu.udea.wi.dao.AnswerDao;
import co.edu.udea.wi.dto.Answer;
import co.edu.udea.wi.dto.Attendant;
import co.edu.udea.wi.dto.Request;
import co.edu.udea.wi.exception.ClassException;
import co.edu.udea.wi.validations.Validations;

@Transactional
public class AnswerBlImpl implements AnswerBl {

	private Validations validations;
	
	@Autowired
	private AnswerDao answerDao;
	
	public AnswerBlImpl() {

		validations = new Validations();
	}

	@Override
	public void create(Answer answer) throws Exception {
		
		List<String> errors = validations.validateAnswer(answer);
		
		if (errors.size() == 0) {
			
			answerDao.add(answer);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public void update(Answer answer) throws Exception {
		
		List<String> errors = validations.validateAnswer(answer);
		
		if (errors.size() == 0) {
			
			answerDao.update(answer);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public void delete(Answer answer) throws Exception {
		
		List<String> errors = validations.validateAnswer(answer);
		
		if (errors.size() == 0) {
			
			answerDao.delete(answer);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public List<Answer> getAnswers() throws Exception {
		
		return answerDao.getAnswers();
	}

	@Override
	public Answer getAnswerById(int id) throws Exception {
		
		return answerDao.getAnswerById(id);
	}

	@Override
	public List<Answer> getAnswersByRequest(Request request) throws Exception {
		
		List<String> errors = validations.validateRequest(request);
		
		if (errors.size() == 0) {
			
			return answerDao.getAnswersByRequest(request);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public List<Answer> getAnswersByAttendant(Attendant attendant) throws Exception {
		
		List<String> errors = validations.validateAttendant(attendant);
		
		if (errors.size() == 0) {
			
			return answerDao.getAnswersByAttendant(attendant);
		} else {
			throw new ClassException();
		}
	}

}
