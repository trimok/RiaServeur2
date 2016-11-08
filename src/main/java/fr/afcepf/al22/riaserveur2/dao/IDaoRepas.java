package fr.afcepf.al22.riaserveur2.dao;

import java.util.List;

import fr.afcepf.al22.riaserveur2.entity.Repas;

public interface IDaoRepas {
	List<Repas> rechercher(String libelle);

	Integer ajouter(Repas repas);

	boolean supprimer(Repas repas);
}
