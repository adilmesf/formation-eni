package tp.cycle.part2;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import tp.cycle.part2.bo.Cycle;
import tp.cycle.part2.bo.Gyropode;
import tp.cycle.part2.bo.Gyroroue;
import tp.cycle.part2.bo.Velo;
import tp.cycle.part2.exception.VeloDejaLoueBusinessException;
import tp.cycle.part2.service.LocationService;

public class Location {

	/**
	 * Crée un tableau de cycles et les affiche
	 * 
	 * @param args pas nécessaire
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		boolean test = false;

		List<Cycle> jeuxdeDonnees = Arrays.asList(
				new Velo(LocalDate.of(2017, Month.JUNE, 2), "Lapierre", "speed 400", 27),
				new Velo(LocalDate.of(2018, Month.APRIL, 9), "Btwin", "riverside 900", 10),
				new Gyropode(LocalDate.of(2018, Month.JUNE, 5), "Segway", "Ninebot Elite", 40, 150),
				new Gyropode(LocalDate.of(2017, Month.MAY, 2), "Weebot", "Echo", 35, 160),
				new Gyroroue(LocalDate.of(2018, Month.MARCH, 25), "Immotion", "v8", 40),
				new Gyroroue(LocalDate.of(2018, Month.MARCH, 25), "Segway", "Ninebot One E+", 30));

		LocationService.ajouterTout(jeuxdeDonnees); // initialsiation du stock de cycles

		System.out.println("Voici les cycles que nous proposons à la location :");
		for (Cycle c : jeuxdeDonnees) {
			System.out.printf("- %-95s %5.2f€/heure%n", c.toString(), c.getTarifLocationHeure());
		}

		try {
			LocationService.louer(jeuxdeDonnees.get(0));
			LocationService.louer(jeuxdeDonnees.get(0));

		} catch (VeloDejaLoueBusinessException e) {
//			System.out.println(e);
			throw new Exception(e);
		}
		for (Cycle c : jeuxdeDonnees) {
			System.out.printf("- %-95s %5.2f€/heure%n", c.toString(), c.getTarifLocationHeure());
		}
	}

}
