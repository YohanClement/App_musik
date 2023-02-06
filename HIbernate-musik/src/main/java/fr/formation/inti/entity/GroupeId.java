package fr.formation.inti.entity;
// Generated 6 f�vr. 2023 � 09:29:17 by Hibernate Tools 5.1.12.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * GroupeId generated by hbm2java
 */
@Embeddable
public class GroupeId implements java.io.Serializable {

	private Integer idGroupe;
	private String nom;
	private String mail;
	private String localisation;
	private String biographie;
	private Integer rencontre;

	public GroupeId() {
	}

	public GroupeId(Integer idGroupe, String nom, String mail, String localisation, String biographie,
			Integer rencontre) {
		this.idGroupe = idGroupe;
		this.nom = nom;
		this.mail = mail;
		this.localisation = localisation;
		this.biographie = biographie;
		this.rencontre = rencontre;
	}

	@Column(name = "id_groupe")
	public Integer getIdGroupe() {
		return this.idGroupe;
	}

	public void setIdGroupe(Integer idGroupe) {
		this.idGroupe = idGroupe;
	}

	@Column(name = "Nom", length = 45)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "mail", length = 100)
	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Column(name = "localisation", length = 45)
	public String getLocalisation() {
		return this.localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	@Column(name = "biographie", length = 2000)
	public String getBiographie() {
		return this.biographie;
	}

	public void setBiographie(String biographie) {
		this.biographie = biographie;
	}

	@Column(name = "rencontre")
	public Integer getRencontre() {
		return this.rencontre;
	}

	public void setRencontre(Integer rencontre) {
		this.rencontre = rencontre;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GroupeId))
			return false;
		GroupeId castOther = (GroupeId) other;

		return ((this.getIdGroupe() == castOther.getIdGroupe()) || (this.getIdGroupe() != null
				&& castOther.getIdGroupe() != null && this.getIdGroupe().equals(castOther.getIdGroupe())))
				&& ((this.getNom() == castOther.getNom()) || (this.getNom() != null && castOther.getNom() != null
						&& this.getNom().equals(castOther.getNom())))
				&& ((this.getMail() == castOther.getMail()) || (this.getMail() != null && castOther.getMail() != null
						&& this.getMail().equals(castOther.getMail())))
				&& ((this.getLocalisation() == castOther.getLocalisation())
						|| (this.getLocalisation() != null && castOther.getLocalisation() != null
								&& this.getLocalisation().equals(castOther.getLocalisation())))
				&& ((this.getBiographie() == castOther.getBiographie()) || (this.getBiographie() != null
						&& castOther.getBiographie() != null && this.getBiographie().equals(castOther.getBiographie())))
				&& ((this.getRencontre() == castOther.getRencontre()) || (this.getRencontre() != null
						&& castOther.getRencontre() != null && this.getRencontre().equals(castOther.getRencontre())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdGroupe() == null ? 0 : this.getIdGroupe().hashCode());
		result = 37 * result + (getNom() == null ? 0 : this.getNom().hashCode());
		result = 37 * result + (getMail() == null ? 0 : this.getMail().hashCode());
		result = 37 * result + (getLocalisation() == null ? 0 : this.getLocalisation().hashCode());
		result = 37 * result + (getBiographie() == null ? 0 : this.getBiographie().hashCode());
		result = 37 * result + (getRencontre() == null ? 0 : this.getRencontre().hashCode());
		return result;
	}

}
