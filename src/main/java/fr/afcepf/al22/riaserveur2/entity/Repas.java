package fr.afcepf.al22.riaserveur2.entity;

// Generated 21 f�vr. 2015 10:38:14 by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Repas generated by hbm2java
 */
@Entity
@Table(name = "repas"
		, catalog = "ria")
public class Repas implements java.io.Serializable {

	private Integer id;
	private Personne personne;
	private Integer nbCal;
	private String description;
	private String libelle;

	public Repas() {
	}

	public Repas(Personne personne) {
		this.personne = personne;
	}

	public Repas(Personne personne, Integer nbCal, String description, String libelle) {
		this.personne = personne;
		this.nbCal = nbCal;
		this.description = description;
		this.libelle = libelle;
	}

	public Repas(Integer id, Integer nbCal, String description, String libelle) {
		this.id = id;
		this.nbCal = nbCal;
		this.description = description;
		this.libelle = libelle;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "personne_id", nullable = false)
	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@Column(name = "nb_cal")
	public Integer getNbCal() {
		return this.nbCal;
	}

	public void setNbCal(Integer nbCal) {
		this.nbCal = nbCal;
	}

	@Column(name = "description", length = 45)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "libelle", length = 45)
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Repas [id=" + id + ", nbCal=" + nbCal + ", description=" + description + ", libelle=" + libelle + "]\n";
	}

}
