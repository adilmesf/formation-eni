package demo.visibility.a;

import java.time.LocalDate;

import demo.visibility.MoyenDeTransport;
import demo.visibility.b.Voiture;

public class VoitureTest {

	public static void main(String[] args) {

		Voiture v1 = new Voiture("marque", "cyan");

		Voiture v2 = new Voiture();
		v2.calculerEmissionCO2();

		((MoyenDeTransport) v2).calculerEmissionCO2();

		MoyenDeTransport m1 = new Voiture();
		m1.calculerEmissionCO2();
		((Voiture) m1).calculerEmissionCO2();

		Voiture.rand.doubles();

		LocalDate.now();

//		v1.roueDeSecours = false;
//		System.out.println(v1.roueDeSecours); // ne compile pas
	}

}
