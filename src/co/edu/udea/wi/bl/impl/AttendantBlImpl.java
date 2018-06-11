package co.edu.udea.wi.bl.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.udea.wi.bl.AttendantBl;
import co.edu.udea.wi.dao.AttendantDao;
import co.edu.udea.wi.dto.Attendant;
import co.edu.udea.wi.exception.ClassException;
import co.edu.udea.wi.validations.Validations;

public class AttendantBlImpl implements AttendantBl {

	private Validations validations;
	
	@Autowired
	private AttendantDao dao;
	
	public AttendantBlImpl() {

		validations = new Validations();
	}
	
	@Override
	public void create(Attendant attendant) throws Exception {
		
		List<String> errors = validations.validateAttendant(attendant);
		
		if (errors.size() == 0) {
			
			dao.add(attendant);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public void update(Attendant attendant) throws Exception {
		
		List<String> errors = validations.validateAttendant(attendant);
		
		if (errors.size() == 0) {
			
			dao.update(attendant);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public void delete(Attendant attendant) throws Exception {
		
		List<String> errors = validations.validateAttendant(attendant);
		
		if (errors.size() == 0) {
			
			dao.delete(attendant);
		} else {
			throw new ClassException();
		}
	}

	@Override
	public List<Attendant> getAttendants() throws Exception {
		
		return dao.getAttendants();
	}

	@Override
	public Attendant getAttendantById(String id) throws Exception {
		
		return dao.getAttendantById(id);
	}

}
