package tp.tp05;

public class MedecinGeneraliste {

	public static final int MAX_CRENEAUX = 15;

	private String nom;
	private String prenom;
	private String numeroDeTelephone;
	private static int tarif = 25;
	private Adresse adresse;
	private Creneau[] creneaux = new Creneau[MAX_CRENEAUX];

	/**
	 * Constructeur : cr�e une instance de Medecin
	 *
	 * @param nom               nom du m�decin
	 * @param prenom            pr�nom du m�decin
	 * @param numeroDeTelephone num�ro de t�l�phone
	 * @param adresse           adresse postale du patient
	 */
	public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
		this.nom = nom.toUpperCase();
		this.prenom = prenom;
		this.numeroDeTelephone = numeroDeTelephone;
		this.adresse = adresse;
	}

	/**
	 * @param creneauAAjouter
	 */
	void ajouterCreneau(Creneau creneauAAjouter) {
		if (this != creneauAAjouter.getMedecin()) {
			System.err.println("Ce cr�neau ne peut �tre associ� � ce m�decin " + "car il est d�j� associ� � un autre");
		} else {
			int pos = 0;
			while (pos < this.creneaux.length && this.creneaux[pos] != null)
				pos++;
			if (pos == this.creneaux.length)
				System.err.println("Trop de cr�neaux sont affect�s � ce m�decin");
			else
				this.creneaux[pos] = creneauAAjouter;
		}
	}

	/**
	 * Affiche sur la console sous la forme : NOM Pr�nom T�l�phone : XXXXXXXXXX
	 * Tarif : XX� Adresse : Compl�ment XXbis rue XXXXXXXXX 00000 XXXXXXXXXXXXX
	 */
	public void afficher() {
		System.out.printf("%s %s%nT�l�phone : %s%nTarif : %d�%nAdresse :%n", this.nom, this.prenom,
				this.numeroDeTelephone, MedecinGeneraliste.tarif);
		this.adresse.afficher();
		System.out.println("Cr�neaux :");
		for (int i = 0; i < this.creneaux.length; i++) {
			if (this.creneaux[i] != null)
				this.creneaux[i].afficher();

		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
