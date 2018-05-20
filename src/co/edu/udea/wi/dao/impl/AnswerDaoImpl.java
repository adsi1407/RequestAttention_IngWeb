package co.edu.udea.wi.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import co.edu.udea.wi.dao.AnswerDao;
import co.edu.udea.wi.dto.Answer;

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
			// TODO: handle exception
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
			// TODO: handle exception
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
			// TODO: handle exception
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
            throw new Exception(e);
        }
        
        return answers;
	}

	@Override
	public Answer getAnswer(int id) throws Exception {
		
		Answer answer = null;
        Session session = null;
        try{
            session = this.getSessionFactory().getCurrentSession();
            
            answer = (Answer)session.load(Answer.class, id);
            
        }catch(HibernateException e){
            throw new Exception(e);
        }
        
        return answer;
	}
}
