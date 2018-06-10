package co.edu.udea.wi.bl;

import java.util.List;
import co.edu.udea.wi.dto.Customer;

public interface CustomerBl {

	/**
	 * Description Este método se utiliza para agregar una respuesta a un cliente
	 * @param customer
	 * @throws Exception
	 */
	public void create(Customer customer) throws Exception;
	
	/**
	 * Description Este método se utiliza para actualizar una respuesta a un cliente
	 * @param customer
	 * @throws Exception
	 */
	public void update(Customer customer) throws Exception;
	
	/**
	 * Description Este método se utiliza para eliminar una respuesta a un cliente
	 * @param customer
	 * @throws Exception
	 */
	public void delete(Customer customer) throws Exception;
	
	/**
	 * Description Este método se utiliza para obtener los clientes
	 * @return
	 * @throws Exception
	 */
	public List<Customer> getCustomers() throws Exception;
	
	/**
	 * Description Este método se utiliza para obtener un cliente por su id
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Customer getCustomerById(String id) throws Exception;
}
