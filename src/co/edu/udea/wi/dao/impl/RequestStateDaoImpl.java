package co.edu.udea.wi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.wi.dao.RequestStateDao;
import co.edu.udea.wi.dto.RequestState;
import co.edu.udea.wi.exception.ClassException;

public class RequestStateDaoImpl extends HibernateDaoSupport implements RequestStateDao {

	@Override
	public void add(RequestState requestState) throws Exception {
		
		Transaction transaction = null;
		Session session = null;
		
		try {
			
			session = this.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.save(requestState);
			transaction.commit();
		} catch (Exception e) {
			throw new ClassException(e);
		}
	}

	@Override
	public void update(RequestState requestState) throws Exception {
		
		Transaction transaction = null;
		Session session = null;
		
		try {
			
			session = this.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.update(requestState);
			transaction.commit();
		} catch (Exception e) {
			throw new ClassException(e);
		}
	}

	@Override
	public void delete(RequestState requestState) throws Exception {
		
		Transaction transaction = null;
		Session session = null;
		
		try {
			
			session = this.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.delete(requestState);
			transaction.commit();
		} catch (Exception e) {
			throw new ClassException(e);
		}
	}

	@Override
	public List<RequestState> getRequestStates() throws Exception {
		
		List<RequestState> requestStates = new ArrayList<RequestState>();
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            Criteria criteria = session.createCriteria(RequestState.class);
            
            requestStates = criteria.list();
            
        }catch(HibernateException e){
        	throw new ClassException(e);
        }
        
        return requestStates;
	}

	@Override
	public RequestState getRequestState(int id) throws Exception {
		
		RequestState requestState = null;
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            requestState = (RequestState)session.load(RequestState.class, id);
            
        }catch(HibernateException e){
        	throw new ClassException(e);
        }
        
        return requestState;
	}

}
