package co.edu.udea.wi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.wi.dao.RequestTypeDao;
import co.edu.udea.wi.dto.RequestType;
import co.edu.udea.wi.exception.ClassException;

public class RequestTypeDaoImpl extends HibernateDaoSupport implements RequestTypeDao {

	@Override
	public void add(RequestType requestType) throws Exception {
		
		Transaction transaction = null;
		Session session = null;
		
		try {
			
			session = this.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.save(requestType);
			transaction.commit();
		} catch (Exception e) {
			throw new ClassException(e);
		}
	}

	@Override
	public void update(RequestType requestType) throws Exception {
		
		Transaction transaction = null;
		Session session = null;
		
		try {
			
			session = this.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.update(requestType);
			transaction.commit();
		} catch (Exception e) {
			throw new ClassException(e);
		}
	}

	@Override
	public void delete(RequestType requestType) throws Exception {
		
		Transaction transaction = null;
		Session session = null;
		
		try {
			
			session = this.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.delete(requestType);
			transaction.commit();
		} catch (Exception e) {
			throw new ClassException(e);
		}
	}

	@Override
	public List<RequestType> getRequestTypes() throws Exception {
		
		List<RequestType> requestTypes = new ArrayList<RequestType>();
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            Criteria criteria = session.createCriteria(RequestType.class);
            
            requestTypes = criteria.list();
            
        }catch(HibernateException e){
        	throw new ClassException(e);
        }
        
        return requestTypes;
	}

	@Override
	public RequestType getRequestTypeById(int id) throws Exception {
		
		RequestType requestType = null;
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            requestType = (RequestType)session.load(RequestType.class, id);
            
        }catch(HibernateException e){
        	throw new ClassException(e);
        }
        
        return requestType;
	}

}
