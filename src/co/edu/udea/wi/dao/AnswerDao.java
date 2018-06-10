package co.edu.udea.wi.dao;

import java.util.List;

import co.edu.udea.wi.dto.Answer;
import co.edu.udea.wi.dto.Attendant;
import co.edu.udea.wi.dto.Request;

/**
 * 
 * @author david_santacoloma
 * Description Esta clase se utiliza para acceder a las respuestas de solicitudes de los usuarios
 */
public interface AnswerDao {

	/**
	 * Description: Este método se utiliza para agregar una respuesta
	 * @param answer
	 * @throws Exception
	 */
	public void add(Answer answer) throws Exception;
	
	/**
	 * Description: Este método se utiliza para actualizar una respuesta
	 * @param answer
	 * @throws Exception
	 */
	public void update(Answer answer) throws Exception;
	
	/**
	 * Description: Este método se utiliza para eliminar una respuesta
	 * @param answer
	 * @throws Exception
	 */
	public void delete(Answer answer) throws Exception;
	
	/**
	 * Description: Este método se utiliza para obtener las respuestas
	 * @return
	 * @throws Exception
	 */
	public List<Answer> getAnswers() throws Exception;
	
	/**
	 * Description: Este método se utiliza para obtener una respuesta por su id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Answer getAnswerById(int id) throws Exception;
	
	/**
	 * Description: Este método se utiliza para obtener las respuestas a una solicitud
	 * @param request
	 * @return
	 * @throws Exception
	 */
	public List<Answer> getAnswersByRequest(Request request) throws Exception;
	
	/**
	 * Description: Este método se utiliza para obtener las respuestas asignadas a un asesor
	 * @param attendant
	 * @return
	 * @throws Exception
	 */
	public List<Answer> getAnswersByAttendant(Attendant attendant) throws Exception;
}