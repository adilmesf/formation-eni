package tp.tp05;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Creneau {
	private LocalTime heureDebut;
	private int duree;
	private MedecinGeneraliste medecin;

	/**
	 * Constructeur
	 *
	 * @param heureDebut heure de début du créneau
	 * @param duree      durée du créneau en minutes
	 * @param medecin    médecin possédant ce créneau La Programmation Orientée
	 *                   Objet (POO) avec Java Page 4/6 www.eni-ecole.fr © ENI -
	 *                   Tous droits réservés
	 */
	public Creneau(LocalTime heureDebut, int duree, MedecinGeneraliste medecin) {
		this.heureDebut = heureDebut;
		this.duree = duree;
		this.medecin = medecin;
		medecin.ajouterCreneau(this);
	}

	/**
	 * Affiche un créneau horaire sous la forme : 00:00 - 00:00 (XX minutes)
	 */
	public void afficher() {
		System.out.printf("%s - %s (%d minutes)%n",
				this.heureDebut.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)),
				this.heureDebut.plusMinutes(this.duree).format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)),
				this.duree);
	}

	/**
	 * Getter pour medecin.
	 * 
	 * @return the medecin
	 */
	public MedecinGeneraliste getMedecin() {
		return medecin;
	}
}
