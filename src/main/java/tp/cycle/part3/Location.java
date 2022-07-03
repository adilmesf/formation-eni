package tp.cycle.part3;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import tp.cycle.part3.bo.Casque;
import tp.cycle.part3.bo.Cycle;
import tp.cycle.part3.bo.Gyropode;
import tp.cycle.part3.bo.Gyroroue;
import tp.cycle.part3.bo.Velo;
import tp.cycle.part3.exception.VeloDejaLoueBusinessException;
import tp.cycle.part3.service.LocationService;
import tp.cycle.part3.service.Louable;

public class Location {

	/**
	 * Crée un tableau de cycles et les affiche
	 * 
	 * @param args pas nécessaire
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		boolean test = false;
		String resultat;

		List<Louable> jeuxdeDonnees = Arrays.asList(
				new Velo(LocalDate.of(2017, Month.JUNE, 2), "Lapierre", "speed 400", 27),
				new Velo(LocalDate.of(2018, Month.APRIL, 9), "Btwin", "riverside 900", 10),
				new Gyropode(LocalDate.of(2018, Month.JUNE, 5), "Segway", "Ninebot Elite", 40, 150),
				new Gyropode(LocalDate.of(2017, Month.MAY, 2), "Weebot", "Echo", 35, 160),
				new Gyroroue(LocalDate.of(2018, Month.MARCH, 25), "Immotion", "v8", 40),
				new Gyroroue(LocalDate.of(2018, Month.MARCH, 25), "Segway", "Ninebot One E+", 30), new Casque());

		LocationService.ajouterTout(jeuxdeDonnees); // initialsiation du stock de cycles

		System.out.println("Voici les cycles que nous proposons à la location :");
		afficherStock(jeuxdeDonnees);

		try {
			LocationService.louer(jeuxdeDonnees.get(0));
//			LocationService.louer(jeuxdeDonnees.get(0));

		} catch (VeloDejaLoueBusinessException e) {
//			System.out.println(e);
			throw new Exception(e);
		}

		afficherStock(jeuxdeDonnees);

		Casque casque = new Casque();
		System.out.println("casque loué ?" + casque.isLoue());
		LocationService.louer(casque);
		System.out.println("casque loué ?" + casque.isLoue());

		System.out.println("article dispo:");
		afficherStock(LocationService.getArticleDisponible());

		System.out.println("Velo.class dispo:");
		afficherStock(LocationService.getLouableDisponible(Velo.class));

		System.out.println("Ensemble des gyro:");
		List<Gyropode> gyros = LocationService.filtrer(Gyropode.class);
		afficherStock(gyros);

		System.out.println("Ensemble des cycles:");
		List<Cycle> cycleFiltre = LocationService.filtrer(Cycle.class);
		afficherStock(cycleFiltre);
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	//

	private static void afficherStock(List<? extends Louable> jeuxdeDonnees) {
		for (Louable louable : jeuxdeDonnees) {
			if (louable instanceof Cycle) {
				System.out.printf("- %-95s %5.2f€/heure%n", ((Cycle) louable).toString(),
						((Cycle) louable).getTarifLocationHeure());
			} else {
				System.out.printf("- %-95s %n", louable.toString());

			}
		}
	}
}

////  lfdljf 