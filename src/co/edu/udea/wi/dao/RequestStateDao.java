package co.edu.udea.wi.dao;

import java.util.List;

import co.edu.udea.wi.dto.RequestState;

public interface RequestStateDao {

	/**
	 * Description Este m�todo se utiliza para agregar un estado de solicitud
	 * @param requestState
	 * @throws Exception
	 */
	public void add(RequestState requestState) throws Exception;
	
	/**
	 * Description Este m�todo se utiliza para actualizar un estado de solicitud
	 * @param requestState
	 * @throws Exception
	 */
	public void update(RequestState requestState) throws Exception;
	
	/**
	 * Description Este m�todo se utiliza para eliminar un estado de solicitud
	 * @param requestState
	 * @throws Exception
	 */
	public void delete(RequestState requestState) throws Exception;
	
	/**
	 * Description Este m�todo se utiliza para obtener los estados de solicitud
	 * @return
	 * @throws Exception
	 */
	public List<RequestState> getRequestStates() throws Exception;
	
	/**
	 * Description Este m�todo se utiliza para obtener un estado de solicitud por su id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public RequestState getRequestStateById(int id) throws Exception;
}
