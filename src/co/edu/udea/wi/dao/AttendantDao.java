package co.edu.udea.wi.dao;

import java.util.List;
import co.edu.udea.wi.dto.Attendant;

public interface AttendantDao {

	/**
	 * Description Este m�todo se utiliza para agregar un encargado
	 * @param attendant
	 * @throws Exception
	 */
	public void add(Attendant attendant) throws Exception;
	
	/**
	 * Description Este m�todo se utiliza para actualizar un encargado
	 * @param attendant
	 * @throws Exception
	 */
	public void update(Attendant attendant) throws Exception;
	
	/**
	 * Description Este m�todo se utiliza para eliminar un encargado
	 * @param attendant
	 * @throws Exception
	 */
	public void delete(Attendant attendant) throws Exception;
	
	/**
	 * Description Este m�todo se utiliza para obtener los encargados
	 * @return
	 * @throws Exception
	 */
	public List<Attendant> getAttendants() throws Exception;
	
	/**
	 * Description Este m�todo se utiliza para obtener un encargado por su id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Attendant getAttendantById(String id) throws Exception;
}
