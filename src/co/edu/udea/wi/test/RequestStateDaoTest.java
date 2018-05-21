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

import co.edu.udea.wi.dao.RequestStateDao;
import co.edu.udea.wi.dto.RequestState;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:SpringConfig.xml")
@Transactional
public class RequestStateDaoTest {

	@Autowired
	RequestStateDao dao;
	
	@Test
	public void addTest() {
		
		RequestState requestState = new RequestState();
		requestState.setName("Open");
		
		try {
			dao.add(requestState);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	@Test
	public void getRequestStatesTest() {
		
		List<RequestState> requestStates = new ArrayList<RequestState>();
		
		try {
			
			requestStates = dao.getRequestStates();
			assertTrue(requestStates.size() > 0);
						
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
