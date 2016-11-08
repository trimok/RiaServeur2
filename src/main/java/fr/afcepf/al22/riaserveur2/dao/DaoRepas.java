package fr.afcepf.al22.riaserveur2.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.afcepf.al22.riaserveur2.entity.Repas;

@Repository
public class DaoRepas implements IDaoRepas {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public List<Repas> rechercher(String libelle) {
		// TODO Auto-generated method stub

		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Repas r where r.libelle like :libelle");
		query.setParameter("libelle", libelle + "%");

		List<Repas> listeRepas = (List<Repas>) query.list();

		return listeRepas;
	}

	public Integer ajouter(Repas repas) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean supprimer(Repas repas) {
		// TODO Auto-generated method stub
		return false;
	}
}
