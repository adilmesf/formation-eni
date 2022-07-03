package tp.tp01;

public class Adresse {
	private String libelleRue;
	private String numeroRue;
	private TypeAdresse type;

	public Adresse(String libelleRue, String numeroRue, TypeAdresse type) {
		super();
		this.libelleRue = libelleRue;
		this.numeroRue = numeroRue;
		this.type = type;
	}

	public Adresse() {

	}

	public String getLibelleRue() {
		return libelleRue;
	}

	public void setLibelleRue(String libelleRue) {
		this.libelleRue = libelleRue;
	}

	public String getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(String numeroRue) {
		this.numeroRue = numeroRue;
	}

	public TypeAdresse getType() {
		return type;
	}

	public void setType(TypeAdresse type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Adresse [libelleRue=").append(libelleRue).append(", numeroRue=").append(numeroRue)
				.append(", type=").append(type).append("]");
		return builder.toString();
	}

}
