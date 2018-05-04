package co.edu.udea.wi.dto;

import java.util.Date;

public class Answer {

	public int ID;
	public Date answerDate;
	public String description;
	public Request request;
	public Attendant attendant;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Date getAnswerDate() {
		return answerDate;
	}
	public void setAnswerDate(Date answerDate) {
		this.answerDate = answerDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Request getRequest() {
		return request;
	}
	public void setRequest(Request request) {
		this.request = request;
	}
	public Attendant getAttendant() {
		return attendant;
	}
	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}
	
}
