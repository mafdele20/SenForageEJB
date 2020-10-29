package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import metier.entities.User;

@Stateless(name="IU")
public class IUserImpl implements IUser{

	@PersistenceContext(unitName = "dsSenForageEJB")
	private EntityManager em;
	@Override
	public User save(User p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User update(User u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delele(Long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public User getUseByPass(String email, String password) {
		   User user = null;
	    	 String select = "SELECT u FROM User u WHERE u.email=:email AND u.password=:password";
			    Query query = em.createQuery(select);
			    query.setParameter("email", email);
			    query.setParameter("password", password);
			    user = (User) query.getSingleResult(); 
			
			return user;
	}

}
