package dao;

import java.util.List;

import javax.ejb.Local;

import metier.entities.Role;

@Local
public interface IRole {

	 public Role save(Role r);
	 public Role getRole(Long id);
	 public List<Role> getAllRoles();
	 public Role update(Role r);
	 public void delele(Long id);
}
