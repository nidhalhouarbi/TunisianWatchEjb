package edu.esprit.TunisianWatch.Service;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.TunisianWatch.Entity.Admin;
import edu.esprit.TunisianWatch.Entity.Citezen;


@Remote
public interface GestionUserRemote {
	public void ajoutCitezen(Citezen citezen);
	public void updateCitezen(Citezen citezen);
	public Citezen findCitezenById(int id_user);
	public void deleteCitezen(Citezen citezen);
	public List<Citezen> findAllCitezens() ;
	
	public void ajoutAdmin(Admin admin);
	public void updateAdmin(Admin admin);
	public Admin findAdminById(int id_user);
	public void deleteAdmin(Admin admin);
	public List<Admin> findAllAdmins(); 
	

}
