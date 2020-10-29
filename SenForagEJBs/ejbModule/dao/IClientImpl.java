package dao;

import java.util.ArrayList;

import java.util.List;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import metier.entities.Client;

@Stateless(name="IC")
public class IClientImpl implements IClient {

	@PersistenceContext(unitName = "dsSenForageEJB")
	private EntityManager em ;

	@Override
	public Client save(Client p) {
		try {
		
			em.persist(p);

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

	@Override
	public Client getClient(Long id) {
		Client c = new Client();
		
		c = em.find(Client.class, id);
			
	
		return c;
	}

	@Override
	public List<Client> getAllClients() {
		List <Client> listeclient = new ArrayList<Client>();

	
			listeclient = em.createQuery( "from Client", Client.class )
                    .getResultList();

		return listeclient;
	}

	@Override
	public Client update(Client c) {
		

		em.persist(c);
			
		return c;
	}

	@Override
	public void delele(Long id) {
		Client c = getClient(id);

		em.remove(c);
		
	}

}
