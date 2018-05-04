package co.edu.udea.wi.dao;

import java.util.List;

import co.edu.udea.wi.dto.Answer;

public interface AnswerDao {

	public void add(Answer answer) throws Exception;
	public void update(Answer answer) throws Exception;
	public void delete(Answer answer) throws Exception;
	public List<Answer> getAnswers() throws Exception;
}