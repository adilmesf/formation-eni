package tp.tp01;

public class PersonneTest {

	public static void main(String[] args) {

		Personne p1 = new Personne();
		Adresse adresse1 = new Adresse("rue tiers", "1", TypeAdresse.PERSO);

		p1.setAdresse(adresse1);

		System.out.println(adresse1.getNumeroRue());
		System.out.println(p1.getAdresse().getNumeroRue());

		adresse1.setNumeroRue("2");

		System.out.println(adresse1.getNumeroRue());
		System.out.println(p1.getAdresse().getNumeroRue());

		p1.getAdresse().setNumeroRue("3");

		System.out.println(adresse1.getNumeroRue());
		System.out.println(p1.getAdresse().getNumeroRue());

		System.out.println(adresse1);
		System.out.println(p1.getAdresse()); // == adresse1

		adresse1 = new Adresse();

		System.out.println(adresse1);
		System.out.println(p1.getAdresse()); // != de adresse1

	}

}
