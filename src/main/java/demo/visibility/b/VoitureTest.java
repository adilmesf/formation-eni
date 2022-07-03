package demo.visibility.b;

public class VoitureTest {

	public static void main(String[] args) {

		createCar();
	}

	private static void createCar() {
		Voiture v1 = new Voiture("marque", "bleu");
		v1.roueDeSecours = false;

		v1.setCouleur("bleu");

		System.out.println(v1.roueDeSecours);
	}

}
