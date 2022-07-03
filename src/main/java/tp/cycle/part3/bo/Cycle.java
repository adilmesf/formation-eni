package tp.cycle.part3.bo;

import java.time.LocalDate;

import tp.cycle.part3.service.Louable;

public abstract class Cycle implements Louable {
	private LocalDate dateAchat;
	private String marque;
	private String modele;
	private boolean isLoue = false;

	public Cycle() {

	}

	/**
	 * Constructeur de cycle
	 * 
	 * @param dateAchat date d'achat du cycle
	 * @param marque    marque du cycle
	 * @param modele    modèle du cycle
	 */
	public Cycle(LocalDate dateAchat, String marque, String modele) {
		this.dateAchat = dateAchat;
		this.marque = marque;
		this.modele = modele;
	}

	/**
	 * Calcule l'âge du cycle en fonction de sa date d'achat
	 * 
	 * @return l'âge du cycle
	 */
	public int age() {
		return dateAchat.until(LocalDate.now()).getYears();
	}

	/**
	 * Indique le tarif de location pour une heure
	 * 
	 * @return le tarif de location pour une heure
	 */
	public abstract Double getTarifLocationHeure();

	public LocalDate getDateAchat() {
		return dateAchat;
	}

	public void setDateAchat(LocalDate dateAchat) {
		this.dateAchat = dateAchat;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	@Override
	public boolean isLoue() {
		return isLoue;
	}

	@Override
	public void setLoue(boolean isLoue) {
		this.isLoue = isLoue;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		int age = this.age();
		return String.format("%s %s %s (%dan%s) loué ? %s", this.getClass().getSimpleName(), this.marque, this.modele,
				age, age > 1 ? "s" : "", isLoue());
	}
}