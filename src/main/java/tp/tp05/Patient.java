package tp.tp05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Patient {
	private String nom;
	private String prenom;
	private String numeroDeTelephone;
	private char sexe;
	private long numSecu;
	private LocalDate dateNaissance;
	private String commentaires;
	private Adresse adresse;

	/**
	 * Constructeur
	 *
	 * @param nom               nom du patient
	 * @param prenom            pr�nom du patient
	 * @param numeroDeTelephone num�ro de t�l�phone du patient
	 * @param sexe              sexe du patient : 'F' pour F�minin ou 'M' pour
	 *                          Masculin
	 * @param numSecu           num�ro de S�curit� sociale du patient
	 * @param dateNaissance     date de naissance du patient
	 * @param commentaires      commentaires associ�s � ce patient (allergies,
	 *                          ant�c�dents m�dicaux�)
	 * @param adresse           adresse postale du patient
	 */
	public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numSecu,
			LocalDate dateNaissance, String commentaires, Adresse adresse) {
		this.nom = nom.toUpperCase();
		this.prenom = prenom;
		this.numeroDeTelephone = numeroDeTelephone;
		this.sexe = sexe;
		this.numSecu = numSecu;
		this.dateNaissance = dateNaissance;
		this.commentaires = commentaires;
		this.adresse = adresse;
	}

	/**
	 * Affiche sur la console sous la forme : NOM Pr�nom T�l�phone : XXXXXXXXXX Sexe
	 * : F�minin ou Masculin Num�ro de S�curit� sociale : XXXXXXXXXXXXXXX Date de
	 * naissance : XX mois XXXX Commentaires : XXXXXXXXXXXXXXX ou [aucun
	 * commentaire] Adresse :
	 */
	public void afficher() {
		System.out.printf(
				"%s %s%nT�l�phone : %s%nSexe : %s%n" + "Num�ro de S�curit� sociale : %d%nDate de "
						+ "naissance : %s%nCommentaires : %s%nAdresse :%n",
				this.nom, this.prenom, this.numeroDeTelephone, this.sexe == 'F' ? "F�minin" : "Masculin", this.numSecu,
				this.dateNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)),
				this.commentaires != null ? this.commentaires : "[aucun commentaire]");
		this.adresse.afficher();

	}
}
