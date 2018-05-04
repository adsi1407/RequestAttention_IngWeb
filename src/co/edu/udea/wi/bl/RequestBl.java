package co.edu.udea.wi.bl;

import co.edu.udea.wi.dto.Request;

public interface RequestBl {

	public void create(Request request) throws Exception;
	public void update(Request request) throws Exception;
}
