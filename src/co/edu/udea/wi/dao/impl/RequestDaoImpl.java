package co.edu.udea.wi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.wi.dao.RequestDao;
import co.edu.udea.wi.dto.Request;

public class RequestDaoImpl extends HibernateDaoSupport implements RequestDao {

	@Override
	public void add(Request request) throws Exception {
		
		Transaction transaction = null;
		Session session = null;
		
		try {
			
			session = this.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.save(request);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void update(Request request) throws Exception {
		
		Transaction transaction = null;
		Session session = null;
		
		try {
			
			session = this.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.update(request);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void delete(Request request) throws Exception {
		
		Transaction transaction = null;
		Session session = null;
		
		try {
			
			session = this.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.delete(request);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public List<Request> getRequests() throws Exception {
		
		List<Request> requests = new ArrayList<Request>();
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            Criteria criteria = session.createCriteria(Request.class);
            
            requests = criteria.list();
            
        }catch(HibernateException e){
            throw new Exception(e);
        }
        
        return requests;
	}

	@Override
	public Request getRequest(int id) throws Exception {
		
		Request request = null;
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            request = (Request)session.load(Request.class, id);
            
        }catch(HibernateException e){
            throw new Exception(e);
        }
        
        return request;
	}
}
