package co.edu.udea.wi.validations;

import java.util.ArrayList;
import java.util.List;

import co.edu.udea.wi.dto.Answer;
import co.edu.udea.wi.dto.Attendant;
import co.edu.udea.wi.dto.Customer;
import co.edu.udea.wi.dto.Request;
import co.edu.udea.wi.dto.RequestState;
import co.edu.udea.wi.dto.RequestType;

public class Validations {
	
	public List<String> validateRequestType(RequestType requestType) {
		
		List<String> errors = new ArrayList<String>();
		
		if (requestType == null) {
			
			errors.add("El tipo de solicitud no puede ser vac�o");
		} else {

			if (requestType.getName() == null || requestType.getName().trim().isEmpty()) {
				errors.add("El nombre del tipo de solicitud no puede ser vac�o");
			}
		}
		
		return errors;
	}
	
	public List<String> validateRequestState(RequestState requestState) {
		
		List<String> errors = new ArrayList<String>();
		
		if (requestState == null) {
			
			errors.add("El estado de solicitud no puede ser vac�o");
		} else {

			if (requestState.getName() == null || requestState.getName().trim().isEmpty()) {
				errors.add("El nombre del estado de solicitud no puede ser vac�o");
			}
		}

		return errors;
	}

	public List<String> validateCustomer(Customer customer) {
		
		List<String> errors = new ArrayList<String>();
		
		if (customer == null) {
			errors.add("El cliente no puede ser vac�o");
		} else {
			
			if (customer.getID() == null || customer.getID().trim() == "") {
				errors.add("El Id del cliente no puede ser vac�o");
			}
			
			if (customer.getFirstName() == null || customer.getFirstName().trim().isEmpty()) {
				errors.add("El nombre del cliente no puede ser vac�o");
			}
			
			if (customer.getLastName() == null || customer.getLastName().trim().isEmpty()) {
				errors.add("El apellido del cliente no puede ser vac�o");
			}
			
			if (customer.getEmail() == null || customer.getEmail().trim().isEmpty()) {
				errors.add("El email del cliente no puede ser vac�o");
			}
			
			if (customer.getPhoneNumber() == null || customer.getPhoneNumber().trim().isEmpty()) {
				errors.add("El tel�fono del cliente no puede ser vac�o");
			}
			
			if (customer.getAddress() == null || customer.getAddress().trim().isEmpty()) {
				errors.add("La direcci�n del cliente no puede ser vac�a");
			}
		}
		
		return errors;
	}
	
	public List<String> validateAttendant(Attendant attendant) {
		
		List<String> errors = new ArrayList<String>();
		
		if (attendant == null) {
			errors.add("El asesor no puede ser vac�o");
		} else {
			
			if (attendant.getID() == null || attendant.getID().trim() == "") {
				errors.add("El Id del asesor no puede ser vac�o");
			}
			
			if (attendant.getFirstName() == null || attendant.getFirstName().trim().isEmpty()) {
				errors.add("El nombre del asesor no puede ser vac�o");
			}
			
			if (attendant.getLastName() == null || attendant.getLastName().trim().isEmpty()) {
				errors.add("El apellido del asesor no puede ser vac�o");
			}
			
			if (attendant.getEmail() == null || attendant.getEmail().trim().isEmpty()) {
				errors.add("El email del asesor no puede ser vac�o");
			}
			
			if (attendant.getPhoneNumber() == null || attendant.getPhoneNumber().trim().isEmpty()) {
				errors.add("El tel�fono del asesor no puede ser vac�o");
			}
			
			if (attendant.getPosition() == null || attendant.getPosition().trim().isEmpty()) {
				errors.add("El cargo del asesor no puede ser vac�o");
			}
		}
		
		return errors;
	}
	
	public List<String> validateRequest(Request request) {

		List<String> errors = new ArrayList<String>();
		
		if (request == null) {
			errors.add("La solicitud no puede ser vac�a");
		} else {
			
			if (request.getDescription() == null || request.getDescription().isEmpty()) {
				errors.add("La descripci�n no puede ser vac�a");
			}
			
			errors.addAll(validateRequestType(request.getType()));
			errors.addAll(validateRequestState(request.getState()));
			errors.addAll(validateCustomer(request.getCustomer()));
		}
		return errors;
	}
	
	public List<String> validateAnswer(Answer answer) {
		
		List<String> errors = new ArrayList<String>();
		
		if (answer == null) {
			errors.add("La respuesta no puede ser vac�a");
		} else {
			
			if (answer.getDescription() == null || answer.getDescription().trim().isEmpty()) {
				errors.add("La descripci�n no puede ser vac�a");
			}
			
			errors.addAll(validateAttendant(answer.getAttendant()));
			errors.addAll(validateRequest(answer.getRequest()));
		}
		
		return errors;
	}
}
