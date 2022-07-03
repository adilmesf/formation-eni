package tp.approcheobjet.bnb;

import java.time.OffsetTime;

public class App {

	public static void main(String[] args) {
		Appartement appartement;
		appartement = new Appartement("1 rue");

		Appartement appartement2 = new Appartement("2 rue");

		System.out.println(appartement.adresse);
		appartement.adresse = "autre rue";
		System.out.println(appartement.adresse);
		System.out.println(appartement2.adresse);

		appartement.toto = "titi";

		System.out.println(appartement2.toto);

		OffsetTime now = OffsetTime.now();

		Terre terre = Terre.instance();
		Terre exoplanete = Terre.instance();

		System.out.println(terre == exoplanete);

		int a = 32;
		Appartement.add(a);
		System.out.println(a);

		Appartement.changerAdresse(appartement2, "tutu");
		System.out.println(appartement.adresse);

	}

}
