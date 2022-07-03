package demo.surcharge;

public class Avion extends EnginMotorise {
	int nombreDeMoteurs;
	String modele;

	@Override
	public String toString() {
		System.out.printf("afficher nombres %s %d", 54, 42);
		return String.format("nombre de moteur: %s, \n modele: %s", nombreDeMoteurs, modele);
	}

	public static void main(String[] args) {
		Avion avion = new Avion();

		System.out.println(avion.toString());

		Avion avion2 = null;
		System.out.println(avion2);

	}
}
