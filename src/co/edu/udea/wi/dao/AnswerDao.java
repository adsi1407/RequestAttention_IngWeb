package co.edu.udea.wi.dao;

import java.util.List;

import co.edu.udea.wi.dto.Answer;

/**
 * 
 * @author david_santacoloma
 * Description Esta clase se utiliza para acceder a las respuestas a las solicitudes de los usuarios
 */
public interface AnswerDao {

	/**
	 * Description Este método se utiliza para agregar una respuesta a una solicitud
	 * @param answer
	 * @throws Exception
	 */
	public void add(Answer answer) throws Exception;
	
	/**
	 * Description Este método se utiliza para actualizar una respuesta a una solicitud
	 * @param answer
	 * @throws Exception
	 */
	public void update(Answer answer) throws Exception;
	
	/**
	 * Description Este método se utiliza para eliminar una respuesta a una solicitud
	 * @param answer
	 * @throws Exception
	 */
	public void delete(Answer answer) throws Exception;
	
	/**
	 * Description Este método se utiliza para obtener las respuestas a solicitudes
	 * @return
	 * @throws Exception
	 */
	public List<Answer> getAnswers() throws Exception;
	
	/**
	 * Description Este método se utiliza para obtener una respuesta por su id
	 * @return
	 * @throws Exception
	 */
	public Answer getAnswer(int id) throws Exception;
}