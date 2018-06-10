package co.edu.udea.wi.dao;

import java.util.List;

import co.edu.udea.wi.dto.Customer;
import co.edu.udea.wi.dto.Request;

/**
 * 
 * @author david_santacoloma
 * Description Esta clase se utiliza para acceder a las solicitudes de los usuarios
 */
public interface RequestDao {

	/**
	 * Description Este método se utiliza para agregar una solicitud
	 * @param request
	 * @throws Exception
	 */
	public void add(Request request) throws Exception;
	
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