package co.edu.udea.wi.bl;

import java.util.List;

import co.edu.udea.wi.dto.RequestType;

public interface RequestTypeBl {

	/**
	 * Description Este método se utiliza para agregar un tipo de solicitud
	 * @param requestType
	 * @throws Exception
	 */
	public void create(RequestType requestType) throws Exception;
	
	/**
	 * Description Este método se utiliza para actualizar un tipo de solicitud
	 * @param requestType
	 * @throws Exception
	 */
	public void update(RequestType requestType) throws Exception;
	
	/**
	 * Description Este método se utiliza para eliminar un tipo de solicitud
	 * @param requestType
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
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public RequestType getRequestTypeById(int id) throws Exception;
}
