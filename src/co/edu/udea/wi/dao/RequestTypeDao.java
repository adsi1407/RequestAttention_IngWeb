package co.edu.udea.wi.dao;

import java.util.List;

import co.edu.udea.wi.dto.RequestType;

public interface RequestTypeDao {

	/**
	 * Description Este método se utiliza para agregar un tipo de solicitud
	 * @param request
	 * @throws Exception
	 */
	public void add(RequestType requestType) throws Exception;
	
	/**
	 * Description Este método se utiliza para actualizar un tipo de solicitud
	 * @param request
	 * @throws Exception
	 */
	public void update(RequestType requestType) throws Exception;
	
	/**
	 * Description Este método se utiliza para eliminar un tipo de solicitud
	 * @param request
	 * @throws Exception
	 */
	public void delete(RequestType requestType) throws Exception;
	
	/**
	 * Description Este método se utiliza para obtener los tipos de solicitud
	 * @return
	 * @throws Exception
	 */
	public List<RequestType> getRequestTypes() throws Exception;
	
	/**
	 * Description Este método se utiliza para obtener un tipo de solicitud por su id
	 * @return
	 * @throws Exception
	 */
	public RequestType getRequestType(int id) throws Exception;
}
