package dao;

import java.util.List;

import javax.ejb.Local;

import metier.entities.User;

@Local
public interface IUser {

	 public User save(User p);
	 public User getUser(Long id);
	 public List<User> getAllUsers();
	 public User update(User u);
	 public void delele(Long id);
	 
	 public User getUseByPass(String email, String password);
}
