package co.edu.udea.wi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.wi.dao.AttendantDao;
import co.edu.udea.wi.dto.Attendant;

public class AttendantDaoImpl extends HibernateDaoSupport implements AttendantDao {

	@Override
	public void add(Attendant attendant) throws Exception {
		
		Transaction transaction = null;
		Session session = null;
		
		try {
			
			session = this.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.save(attendant);
			transaction.commit();
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public void update(Attendant attendant) throws Exception {
		
		Transaction transaction = null;
		Session session = null;
		
		try {
			
			session = this.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.update(attendant);
			transaction.commit();
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	@Override
	public void delete(Attendant attendant) throws Exception {
		
		Transaction transaction = null;
		Session session = null;
		
		try {
			
			session = this.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.delete(attendant);
			transaction.commit();
		} catch (Exception e) {
			throw new Exception(e);
		} 
	}

	@Override
	public List<Attendant> getAttendants() throws Exception {
		
		List<Attendant> attendants = new ArrayList<Attendant>();
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            Criteria criteria = session.createCriteria(Attendant.class);
            
            attendants = criteria.list();
            
        }catch(HibernateException e){
            throw new Exception(e);
        }
        
        return attendants;
	}

	@Override
	public Attendant getAttendant(String id) throws Exception {
		
		Attendant attendant = null;
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            attendant = (Attendant)session.load(Attendant.class, id);
            
        }catch(HibernateException e){
            throw new Exception(e);
        }
        
        return attendant;
	}

}
