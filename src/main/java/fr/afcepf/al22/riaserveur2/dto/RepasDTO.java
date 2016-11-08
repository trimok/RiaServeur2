package fr.afcepf.al22.riaserveur2.dto;

import java.io.Serializable;

public class RepasDTO implements Serializable {

	private Integer id;
	private int nb_cal;
	private String description;
	private String libelle;

	public RepasDTO(Integer id, int nb_cal, String description, String libelle) {
		super();
		this.id = id;
		this.nb_cal = nb_cal;
		this.description = description;
		this.libelle = libelle;
	}

	public RepasDTO() {

		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getNb_cal() {
		return nb_cal;
	}

	public void setNb_cal(int nb_cal) {
		this.nb_cal = nb_cal;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Repas [id=" + id + ", nb_cal=" + nb_cal + ", description="
				+ description + ", libelle=" + libelle + "]";
	}

}
