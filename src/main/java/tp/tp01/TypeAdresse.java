package tp.tp01;

public enum TypeAdresse {
	PRO("Pro"), PERSO("Perso");

	private String libelle;

	private TypeAdresse(String libelle) {
		this.libelle = libelle;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
