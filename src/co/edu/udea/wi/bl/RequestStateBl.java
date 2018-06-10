package co.edu.udea.wi.bl;

import java.util.List;

import co.edu.udea.wi.dto.RequestState;

/**
 * 
 * @author david_santacoloma
 * Description: Esta clase se utiliza para gestionar la creación y actualización de estados de solicitudes
 */
public interface RequestStateBl {
	
	/**
	 * Description Este método se utiliza para agregar un estado de solicitud
	 * @param requestState
	 * @throws Exception
	 */
	public void create(RequestState requestState) throws Exception;
	
	/**
	 * Description Este método se utiliza para actualizar un estado de solicitud
	 * @param requestState
	 * @throws Exception
	 */
	public void update(RequestState requestState) throws Exception;
	
	/**
	 * Description Este método se utiliza para eliminar un estado de solicitud
	 * @param requestState
	 * @throws Exception
	 */
	public void delete(RequestState requestState) throws Exception;
	
	/**
	 * Description Este método se utiliza para obtener los estados de solicitud
	 * @return
	 * @throws Exception
	 */
	public List<RequestState> getRequestStates() throws Exception;
	
	/**
	 * Description Este método se utiliza para obtener un estado de solicitud por su id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public RequestState getRequestStateById(int id) throws Exception;
}
