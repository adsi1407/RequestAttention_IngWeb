package co.edu.udea.wi.bl;

import java.util.List;

import co.edu.udea.wi.dto.Customer;
import co.edu.udea.wi.dto.Request;

/**
 * 
 * @author david_santacoloma
 * Description: Esta clase se utiliza para gestionar la creación y actualización de respuestas a las solicitudes de los usuarios
 */
public interface RequestBl {

	/**
	 * Description Este método se utiliza para agregar una solicitud
	 * @param request
	 * @throws Exception
	 */
	public void create(Request request) throws Exception;
	
	/**
	 * Description Este método se utiliza para actualizar una solicitud
	 * @param request
	 * @throws Exception
	 */
	public void update(Request request) throws Exception;
	
	/**
	 * Description Este método se utiliza para eliminar una solicitud
	 * @param request
	 * @throws Exception
	 */
	public void delete(Request request) throws Exception;
	
	/**
	 * Description Este método se utiliza para obtener las solicitudes
	 * @return
	 * @throws Exception
	 */
	public List<Request> getRequests() throws Exception;
	
	/**
	 * Description Este método se utiliza para obtener una solicitud por su id
	 * @return
	 * @throws Exception
	 */
	public Request getRequestById(int id) throws Exception;
	
	/**
	 * Description Este método se utiliza para obtener las solicitudes hechas por un cliente
	 * @param customer
	 * @return
	 * @throws Exception
	 */
	public List<Request> getRequestByCustomer(Customer customer) throws Exception;
}
