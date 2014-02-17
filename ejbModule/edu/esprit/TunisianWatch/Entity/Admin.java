package edu.esprit.TunisianWatch.Entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity

public class Admin extends User implements Serializable {

	
	private String type;
	private String code_cnss;
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCode_cnss() {
		return code_cnss;
	}

	public void setCode_cnss(String code_cnss) {
		this.code_cnss = code_cnss;
	}   
	
   
}
