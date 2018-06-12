package co.edu.udea.wi.bl;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import co.edu.udea.wi.dto.Customer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:SpringConfig.xml")
@Transactional
public class CustomerBlTest {

	@Autowired
	CustomerBl customerBl;
	
	@Test
	public void getCustomers_NotNull() {
		
		List<Customer> customers = null;
		
		try {
			
			customers = customerBl.getCustomers();
			Assert.notNull(customers);
		} catch (Exception e) {
			
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
