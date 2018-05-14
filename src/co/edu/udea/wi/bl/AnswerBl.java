package co.edu.udea.wi.bl;

import co.edu.udea.wi.dto.Answer;

/**
 * 
 * @author david_santacoloma
 * Description: Esta clase se utiliza para gestionar la creación y actualización de solicitudes de los usuarios
 */
public interface AnswerBl {

	/**
	 * Description: Este método se utiliza para crear solicitudes
	 * @param answer
	 * @throws Exception
	 */
	public void create(Answer answer) throws Exception;
	
	/**
	 * Description: Este método se utiliza para actualizar solicitudes
	 * @param answer
	 * @throws Exception
	 */
	public void update(Answer answer) throws Exception;
}
