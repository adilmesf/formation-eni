package tp.approcheobjet.bnb;

public class Appartement {

	public static String toto = "toto";

	public String adresse;

	public Appartement() {

	}

	public Appartement(String adresse) {
		this.adresse = adresse;
	}

	public double getSuperficie() {
		return 33d;
	}

	public static String toto() {
		return toto;
	}

	/**
	 * par référence
	 * 
	 * @param appartement
	 * @param nouvelleAdresse
	 */
	public static void changerAdresse(Appartement t, String nouvelleAdresse) {
		t.adresse = nouvelleAdresse;
	}

	/**
	 * par valeur
	 * 
	 * @param i
	 */
	public static void add(int i) {
		i = i + 1;
	}

}
