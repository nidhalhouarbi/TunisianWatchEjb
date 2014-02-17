package edu.esprit.TunisianWatch.Entity;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
public class User implements Serializable {

	
	
	
	private Integer id_user;
	private String firstname;
	private String lastname;
	private String email;
	private boolean is_Admin;
	private String login;
	private String password;
	
	
	
	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_user() {
		return this.id_user;
	}

	public void setId_user(Integer id_user) {
		this.id_user = id_user;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isIs_Admin() {
		return is_Admin;
	}
	public void setIs_Admin(boolean is_Admin) {
		this.is_Admin = is_Admin;
	}
	


}
