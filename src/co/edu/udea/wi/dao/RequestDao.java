package co.edu.udea.wi.dao;

import java.util.List;

import co.edu.udea.wi.dto.Request;

public interface RequestDao {

	public void add(Request request) throws Exception;
	public void update(Request request) throws Exception;
	public void delete(Request request) throws Exception;
	public List<Request> getRequests() throws Exception;
}