package dao;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Client;


@Local
public interface IClient {
	
	 public Client save(Client p);
	 public Client getClient(Long id);
	 public List<Client> getAllClients();
	 public Client update(Client c);
	 public void delele(Long id);
}
