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
	 * @param heureDebut heure de d�but du cr�neau
	 * @param duree      dur�e du cr�neau en minutes
	 * @param medecin    m�decin poss�dant ce cr�neau La Programmation Orient�e
	 *                   Objet (POO) avec Java Page 4/6 www.eni-ecole.fr � ENI -
	 *                   Tous droits r�serv�s
	 */
	public Creneau(LocalTime heureDebut, int duree, MedecinGeneraliste medecin) {
		this.heureDebut = heureDebut;
		this.duree = duree;
		this.medecin = medecin;
		medecin.ajouterCreneau(this);
	}

	/**
	 * Affiche un cr�neau horaire sous la forme : 00:00 - 00:00 (XX minutes)
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
