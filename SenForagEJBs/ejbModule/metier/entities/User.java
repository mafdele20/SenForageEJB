package metier.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class User implements Serializable{
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY )
	 private Long id;
	 private String nom;
	 private String prenom;
	 private String email;
	 private String password;
	@ManyToOne
	 private Role role = new Role();
	 private static final long serialVersionUID = 1L;
	 public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
		super();
	}
    public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	 
	 
 
}
