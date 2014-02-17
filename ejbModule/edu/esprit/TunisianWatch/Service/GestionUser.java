package edu.esprit.TunisianWatch.Service;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import edu.esprit.TunisianWatch.Entity.Admin;
import edu.esprit.TunisianWatch.Entity.Citezen;
import edu.esprit.TunisianWatch.Service.GestionUserRemote;

/**
 * Session Bean implementation class GestionUser
 */
@Stateless
@LocalBean
public class GestionUser implements GestionUserRemote {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;
    public GestionUser() {
     
    }

    @Override
	public void ajoutCitezen(Citezen citezen) {
		em.persist(citezen);
		
	}
	

	@Override
	public void updateCitezen(Citezen citezen) {
		em.merge(citezen);
		
	}

	@Override
	public Citezen findCitezenById(int id_user) {
		Citezen citezen=em.find(Citezen.class, id_user);
		return citezen;
	}

	@Override
	public void deleteCitezen(Citezen citezen) {
		
		em.remove(em.merge(citezen));
	}

	@Override
	public void ajoutAdmin(Admin admin) {
		em.persist(admin);
		
	}

	@Override
	public void updateAdmin(Admin admin) {
		em.merge(admin);
		
	}

	@Override
	public Admin findAdminById(int id_user) {
		Admin admin=em.find(Admin.class, id_user);
		return admin;
		
	}

	@Override
	public void deleteAdmin(Admin admin) {
		em.remove(em.merge(admin));
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Citezen> findAllCitezens() {
	   
		return  em.createQuery("select * from User where DTYPE= 'Citezen'").getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> findAllAdmins() {
		return  em.createQuery("select * from User where DTYPE= 'Admin'").getResultList();
	}

	

	

}
