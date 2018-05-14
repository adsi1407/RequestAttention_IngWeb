package co.edu.udea.wi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.wi.dao.CustomerDao;
import co.edu.udea.wi.dto.Customer;
import co.edu.udea.wi.dto.Request;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public void add(Customer customer) throws Exception {
		
		Transaction transaction = null;
		Session session = null;
		
		try {
			
			session = this.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.save(customer);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			session.close();
		}
	}

	@Override
	public void update(Customer customer) throws Exception {
		
		Transaction transaction = null;
		Session session = null;
		
		try {
			
			session = this.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.update(customer);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			session.close();
		}
	}

	@Override
	public void delete(Customer customer) throws Exception {
		
		Transaction transaction = null;
		Session session = null;
		
		try {
			
			session = this.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.delete(customer);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			session.close();
		}
	}

	@Override
	public List<Customer> getCustomers() throws Exception {
		
		List<Customer> customers = new ArrayList<Customer>();
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            Criteria criteria = session.createCriteria(Customer.class);
            
            customers = criteria.list();
            
        }catch(HibernateException e){
            throw new Exception(e);
        }finally{
        	session.close();
        }
        
        return customers;
	}

	@Override
	public Customer getCustomer(String id) throws Exception {
		
		Customer customer = null;
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            customer = (Customer)session.load(Customer.class, id);
            
        }catch(HibernateException e){
            throw new Exception(e);
        }finally{
            session.close();
        }
        
        return customer;
	}

}
