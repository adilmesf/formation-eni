package tp.tp05;

public class Adresse {
	private String mentionsCompl;
	private int numero;
	private String complNumero;
	private String rue;
	private int cp;
	private String ville;

	/**
	 * Constructeur
	 * 
	 * @param mentionsCompl mentions compl�mentaires �ventuelles (comme
	 *                      l�appartement, l��tage, l�escalier, � chez� �, le
	 *                      b�timent ou la r�sidence)
	 * @param numero        num�ro dans la voie
	 * @param complNumero   compl�ment facultatif de num�ro tel bis, ter, quater...
	 * @param rue           type de voie (rue, avenue, etc.) et nom de celle-ci
	 * @param cp            code postal
	 * @param ville         nom de la commune
	 */
	public Adresse(String mentionsCompl, int numero, String complNumero, String rue, int cp, String ville) {
		this.mentionsCompl = mentionsCompl;
		this.numero = numero;
		this.complNumero = complNumero;
		this.rue = rue;
		this.cp = cp;
		this.ville = ville.toUpperCase();
	}

	/**
	 * Constructeur
	 * 
	 * @param numero      num�ro dans la voie
	 * @param complNumero compl�ment facultatif de num�ro tel bis, ter, quater...
	 * @param rue         type de voie (rue, avenue, etc.) et nom de celle-ci
	 * @param cp          code postal
	 * @param ville       nom de la commune
	 */
	public Adresse(int numero, String complNumero, String rue, int cp, String ville) {
		this(null, numero, complNumero, rue, cp, ville);
	}

	/**
	 * Affiche sur la console sous la forme : Compl�ment XXbis rue XXXXXXXXX 00000
	 * XXXXXXXXXXXXX
	 */
	public void afficher() {
		if (this.mentionsCompl != null)
			System.out.println(mentionsCompl);
		System.out.printf("%d%s %s%n%05d %s%n", this.numero, this.complNumero != null ? this.complNumero : "", this.rue,
				this.cp, this.ville);
	}
}
