package co.edu.udea.wi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.wi.exception.ClassException;
import co.edu.udea.wi.dao.AnswerDao;
import co.edu.udea.wi.dto.Answer;
import co.edu.udea.wi.dto.Attendant;
import co.edu.udea.wi.dto.Request;

public class AnswerDaoImpl extends HibernateDaoSupport implements AnswerDao {

	@Override
	public void add(Answer answer) throws Exception {
		
		Transaction transaction = null;
		Session session = null;
		
		try {
			
			session = this.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.save(answer);
			transaction.commit();
		} catch (Exception e) {
			throw new ClassException(e);
		}
	}

	@Override
	public void update(Answer answer) throws Exception {
		
		Transaction transaction = null;
		Session session = null;
		
		try {
			
			session = this.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.update(answer);
			transaction.commit();
		} catch (Exception e) {
			throw new ClassException(e);
		}
	}

	@Override
	public void delete(Answer answer) throws Exception {
		
		Transaction transaction = null;
		Session session = null;
		
		try {
			
			session = this.getSessionFactory().getCurrentSession();
			transaction = session.beginTransaction();
			session.delete(answer);
			transaction.commit();
		} catch (Exception e) {
			throw new ClassException(e);
		}
	}

	@Override
	public List<Answer> getAnswers() throws Exception {
		
		List<Answer> answers = new ArrayList<Answer>();
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            Criteria criteria = session.createCriteria(Answer.class);
            
            answers = criteria.list();
            
        }catch(HibernateException e){
        	throw new ClassException(e);
        }
        
        return answers;
	}

	@Override
	public Answer getAnswerById(int id) throws Exception {
		
		Answer answer = null;
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            answer = (Answer)session.load(Answer.class, id);
            
        }catch(HibernateException e){
        	throw new ClassException(e);
        }
        
        return answer;
	}
	
	@Override
	public List<Answer> getAnswersByRequest(Request request) throws Exception {
		
		List<Answer> answers = new ArrayList<Answer>();
		Session session = null;
		
		try {
			session = this.getSessionFactory().getCurrentSession();
            
            Criteria criteria = session.createCriteria(Answer.class);
            
            answers = criteria.add(Restrictions.eq("request", request)).list();
            
		} catch (HibernateException e) {
			throw new ClassException(e);
		}
		
		return answers;
	}
	
	@Override
	public List<Answer> getAnswersByAttendant(Attendant attendant) throws Exception {

		List<Answer> answers = new ArrayList<Answer>();
		Session session = null;
		
		try {
			session = this.getSessionFactory().getCurrentSession();
            
            Criteria criteria = session.createCriteria(Answer.class);
            
            answers = criteria.add(Restrictions.eq("attendant", attendant)).list();
		} catch (HibernateException e) {
			throw new ClassException(e);
		}
		
		return answers;
	}
}
