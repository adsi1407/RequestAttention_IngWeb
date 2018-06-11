package co.edu.udea.wi.dao;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.wi.dao.CustomerDao;
import co.edu.udea.wi.dto.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:SpringConfig.xml")
@Transactional
public class CustomerDaoTest {

	@Autowired
	CustomerDao dao;
	
	@Test
	public void addTest() {
		
		Customer customer = new Customer();
		customer.setID("1234567890");
		customer.setFirstName("Customer Name");
		customer.setLastName("Customer LastName");
		customer.setAddress("Calle 1");
		customer.setEmail("customer@prueba.com.co");
		customer.setPhoneNumber("3013335577");
		
		try {
			dao.add(customer);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void getCustomersTest() {
		
		List<Customer> customers = new ArrayList<Customer>();
		
		try {
			
			customers = dao.getCustomers();
			assertTrue(customers.size() > 0);
						
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
