package edu.esprit.TunisianWatch.Entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Citezen
 *
 */
@Entity

public class Citezen extends User implements Serializable {

	
	private String adresse;
	private static final long serialVersionUID = 1L;

	public Citezen() {
		super();
	}   
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
   
}
