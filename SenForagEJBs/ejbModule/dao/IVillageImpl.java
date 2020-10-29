package dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import metier.entities.Village;

@Stateless(name="IV")
public class IVillageImpl implements IVillage{
	
	@PersistenceContext(unitName = "dsSenForageEJB")
	private EntityManager em ;
	
	@Override
	public Village save(Village v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Village getVillage(Long id) {
		Village v = new Village();
	
		  v = em.find(Village.class, id);
		return v;
	}

	@Override
	public List<Village> getAllVillages() {
		List <Village> listeV = new ArrayList<Village>();

	
			listeV = em.createQuery( "from Village", Village.class )
                    .getResultList();
				
		return listeV;
	}

	@Override
	public Village update(Village v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delele(Long id) {
		// TODO Auto-generated method stub
		
	}

}
