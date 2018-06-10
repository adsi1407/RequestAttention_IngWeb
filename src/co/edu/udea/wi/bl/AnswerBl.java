package co.edu.udea.wi.bl;

import java.util.List;

import co.edu.udea.wi.dto.Answer;
import co.edu.udea.wi.dto.Attendant;
import co.edu.udea.wi.dto.Request;

/**
 * 
 * @author david_santacoloma
 * Description: Esta clase se utiliza para gestionar la creación y actualización de respuestas a las solicitudes de los usuarios
 */
public interface AnswerBl {

	/**
	 * Description: Este método se utiliza para crear respuestas
	 * @param answer
	 * @throws Exception
	 */
	public void create(Answer answer) throws Exception;
	
	/**
	 * Description: Este método se utiliza para actualizar respuestas
	 * @param answer
	 * @throws Exception
	 */
	public void update(Answer answer) throws Exception;
	
	/**
	 * Description: Este método se utiliza para eliminar respuestas
	 * @param answer
	 * @throws Exception
	 */
	public void delete(Answer answer) throws Exception;
	
	/**
	 * Description: Este método se utiliza para obtener todas las respuestas
	 * @return
	 * @throws Exception
	 */
	public List<Answer> getAnswers() throws Exception;
	
	/**
	 * Description: Este método se utiliza para obtener una respuesta por el id
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