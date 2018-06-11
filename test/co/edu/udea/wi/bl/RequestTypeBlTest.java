package co.edu.udea.wi.bl;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.wi.bl.RequestTypeBl;
import co.edu.udea.wi.dto.RequestType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:SpringConfig.xml")
@Transactional
public class RequestTypeBlTest {

	@Autowired
	RequestTypeBl requestTypeBl;
	
	@Test
	public void create_nullRequestType_errorMessage() {
		
		String expectedMessage = "Errores:" + System.getProperty("line.separator") + "- El tipo de solicitud no puede ser vacío";
		
		try {
			
			requestTypeBl.create(null);
		} catch (Exception e) {

			Assert.assertEquals(expectedMessage, e.getMessage());
		}
	}
	
	@Test
	public void create_nullName_errorMessage() {
		
		RequestType requestType = new RequestType();
		
		String expectedMessage = "Errores:" + System.getProperty("line.separator") + "- El nombre del tipo de solicitud no puede ser vacío";
		
		try {
			
			requestTypeBl.create(requestType);
		} catch (Exception e) {

			Assert.assertEquals(expectedMessage, e.getMessage());
		}
	}
	
	@Test
	public void create_emptyName_errorMessage() {
		
		RequestType requestType = new RequestType();
		requestType.setName("");
		
		String expectedMessage = "Errores:" + System.getProperty("line.separator") + "- El nombre del tipo de solicitud no puede ser vacío";
		
		try {
			
			requestTypeBl.create(requestType);
		} catch (Exception e) {

			Assert.assertEquals(expectedMessage, e.getMessage());
		}
	}
	
	@Test
	public void create_correctObject_successfulCreation() {
		
		RequestType requestType = new RequestType();
		requestType.setName("TestType");

		try {
			
			requestTypeBl.create(requestType);
		} catch (Exception e) {
			
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
