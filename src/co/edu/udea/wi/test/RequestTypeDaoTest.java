package co.edu.udea.wi.test;

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

import co.edu.udea.wi.dao.RequestTypeDao;
import co.edu.udea.wi.dto.RequestType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:SpringConfig.xml")
@Transactional
public class RequestTypeDaoTest {

	@Autowired
	RequestTypeDao dao;
	
	@Test
	public void addTest() {
		
		RequestType requestType = new RequestType();
		requestType.setName("Suggestion");
		
		try {
			dao.add(requestType);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void getRequestTypesTest() {
		
		List<RequestType> requestTypes = new ArrayList<RequestType>();
		
		try {
			
			requestTypes = dao.getRequestTypes();
			assertTrue(requestTypes.size() > 0);
						
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
