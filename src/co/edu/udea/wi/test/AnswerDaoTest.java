package co.edu.udea.wi.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import co.edu.udea.wi.dao.AnswerDao;
import co.edu.udea.wi.dto.Answer;
import co.edu.udea.wi.dto.Attendant;
import co.edu.udea.wi.dto.Customer;
import co.edu.udea.wi.dto.Request;
import co.edu.udea.wi.dto.RequestState;
import co.edu.udea.wi.dto.RequestType;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:SpringConfig.xml")
@Transactional
public class AnswerDaoTest {

	@Autowired
	AnswerDao dao;
	
	@Test
	public void addTest() {
		
		Attendant attendant = new Attendant();
		attendant.setFirstName("Test Name");
		attendant.setLastName("Test LastName");
		attendant.setPhoneNumber("3001112233");
		attendant.setEmail("prueba@prueba.com.co");
		attendant.setPosition("Advisor");
		
		Customer customer = new Customer();
		customer.setFirstName("Customer Name");
		customer.setLastName("Customer LastName");
		customer.setAddress("Calle 1");
		customer.setEmail("customer@prueba.com.co");
		customer.setPhoneNumber("3013335577");
		
		RequestState requestState = new RequestState();
		requestState.setName("Open");
		
		RequestType requestType = new RequestType();
		requestType.setName("Suggestion");
		
		Request request = new Request();
		request.setApplicationDate(new Date());
		request.setCustomer(customer);
		request.setDescription("test description");
		request.setState(requestState);
		request.setType(requestType);
		
		Answer answer = new Answer();
		answer.setAnswerDate(new Date());
		answer.setDescription("test");
		answer.setAttendant(attendant);
		answer.setRequest(request);
		
		try {
			dao.add(answer);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}
