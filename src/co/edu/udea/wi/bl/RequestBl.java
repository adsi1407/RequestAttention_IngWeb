package co.edu.udea.wi.bl;

import co.edu.udea.wi.dto.Request;

/**
 * 
 * @author david_santacoloma
 * Description: Esta clase se utiliza para gestionar la creación y actualización respuestas a las solicitudes de los usuarios
 */
public interface RequestBl {

	/**
	 * Description: Este método se utiliza para crear respuestas
	 * @param request
	 * @throws Exception
	 */
	public void create(Request request) throws Exception;
	
	/**
	 * Description: Este método se utiliza para actualizar respuestas
	 * @param request
	 * @throws Exception
	 */
	public void update(Request request) throws Exception;
}
