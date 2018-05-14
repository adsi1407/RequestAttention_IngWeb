package co.edu.udea.wi.dao;

import java.util.List;

import co.edu.udea.wi.dto.Attendant;

public interface AttendantDao {

	/**
	 * Description Este método se utiliza para agregar una respuesta a un encargado
	 * @param answer
	 * @throws Exception
	 */
	public void add(Attendant attendant) throws Exception;
	
	/**
	 * Description Este método se utiliza para actualizar una respuesta a un encargado
	 * @param answer
	 * @throws Exception
	 */
	public void update(Attendant attendant) throws Exception;
	
	/**
	 * Description Este método se utiliza para eliminar una respuesta a un encargado
	 * @param answer
	 * @throws Exception
	 */
	public void delete(Attendant attendant) throws Exception;
	
	/**
	 * Description Este método se utiliza para obtener los encargados
	 * @return
	 * @throws Exception
	 */
	public List<Attendant> getAttendants() throws Exception;
	
	/**
	 * Description Este método se utiliza para obtener un encargado por su id
	 * @return
	 * @throws Exception
	 */
	public Attendant getAttendant(String id) throws Exception;
}
