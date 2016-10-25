package Dao;

import java.util.List;

import javax.management.Query;
import javax.transaction.Transactional;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.User;


@Repository("udao")
public class UserDaoImple implements UserDao {
	
	
	

	    @Autowired
	    private SessionFactory sessionFactory;
	 
	   
	    
	 
	    public SessionFactory getSessionFactory() {
			return sessionFactory;
		}




		public void setSessionFactory(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}




		@Transactional
	    public void save(User u) {
	        Session session=sessionFactory.openSession();
	        session.save(u);
	        session.flush();
	        session.close();
	    }
		/*@Transactional
	    public void update(User u) {
	        Session session=sessionFactory.openSession();
	        session.update(u);
	        session.flush();
	        session.close();
	    }*/
		/*@Transactional
	    public void delete(User u) {
	        Session session=sessionFactory.openSession();
	        session.delete(u);
	        session.flush();
	        session.close();
	    }*/

}

