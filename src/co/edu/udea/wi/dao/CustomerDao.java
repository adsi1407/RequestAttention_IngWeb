package co.edu.udea.wi.dao;

import java.util.List;
import co.edu.udea.wi.dto.Customer;

public interface CustomerDao {

	/**
	 * Description Este m�todo se utiliza para agregar una respuesta a un cliente
	 * @param customer
	 * @throws Exception
	 */
	public void add(Customer customer) throws Exception;
	
	/**
	 * Description Este m�todo se utiliza para actualizar una respuesta a un cliente
	 * @param customer
	 * @throws Exception
	 */
	public void update(Customer customer) throws Exception;
	
	/**
	 * Description Este m�todo se utiliza para eliminar una respuesta a un cliente
	 * @param customer
	 * @throws Exception
	 */
	public void delete(Customer customer) throws Exception;
	
	/**
	 * Description Este m�todo se utiliza para obtener los clientes
	 * @return
	 * @throws Exception
	 */
	public List<Customer> getCustomers() throws Exception;
	
	/**
	 * Description Este m�todo se utiliza para obtener un cliente por su id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Customer getCustomerById(String id) throws Exception;
}
