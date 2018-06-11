package co.edu.udea.wi.bl;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.wi.bl.RequestStateBl;
import co.edu.udea.wi.dto.RequestState;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:SpringConfig.xml")
@Transactional
public class RequestStateBlTest {

	@Autowired
	RequestStateBl requestStateBl;
	
	@Test
	public void create_nullRequestState_errorMessage() {
		
		String expectedMessage = "Errores:" + System.getProperty("line.separator") + "- El estado de solicitud no puede ser vacío";
		
		try {
			
			requestStateBl.create(null);
		} catch (Exception e) {

			Assert.assertEquals(expectedMessage, e.getMessage());
		}
	}
	
	@Test
	public void create_nullName_errorMessage() {
		
		RequestState requestState = new RequestState();
		
		String expectedMessage = "Errores:" + System.getProperty("line.separator") + "- El nombre del estado de solicitud no puede ser vacío";
		
		try {
			
			requestStateBl.create(requestState);
		} catch (Exception e) {

			Assert.assertEquals(expectedMessage, e.getMessage());
		}
	}
	
	@Test
	public void create_emptyName_errorMessage() {
		
		RequestState requestState = new RequestState();
		requestState.setName("");
		
		String expectedMessage = "Errores:" + System.getProperty("line.separator") + "- El nombre del estado de solicitud no puede ser vacío";
		
		try {
			
			requestStateBl.create(requestState);
		} catch (Exception e) {

			Assert.assertEquals(expectedMessage, e.getMessage());
		}
	}
	
	@Test
	public void create_correctObject_successfulCreation() {
		
		RequestState requestState = new RequestState();
		requestState.setName("TestType");

		try {
			
			requestStateBl.create(requestState);
		} catch (Exception e) {
			
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
