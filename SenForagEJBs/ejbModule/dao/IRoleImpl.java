package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import metier.entities.Role;

@Stateless(name="IR")
public class IRoleImpl implements IRole{


	@PersistenceContext(unitName = "dsSenForageEJB")
	private EntityManager em ;

	@Override
	public Role save(Role r) {
		try {
			
			em.persist(r);

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;
	}

	@Override
	public Role getRole(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> getAllRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Role update(Role r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delele(Long id) {
		// TODO Auto-generated method stub
		
	}

}
