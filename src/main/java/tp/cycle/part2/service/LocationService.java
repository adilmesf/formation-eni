package tp.cycle.part2.service;

import java.util.ArrayList;
import java.util.List;

import tp.cycle.part2.bo.Cycle;
import tp.cycle.part2.exception.VeloDejaLoueBusinessException;

public class LocationService {

	private static List<Cycle> stock;

	static {
		stock = new ArrayList<Cycle>();
	}

	public static void ajouter(Cycle cycle) {
		stock.add(cycle);
	}

	public static void ajouterTout(List<Cycle> cycles) {
		stock.addAll(cycles);
	}

	public synchronized static void louer(Cycle cycle) throws VeloDejaLoueBusinessException {
		if (cycle.isLoue()) {
			throw new VeloDejaLoueBusinessException("Cycle déjà loué");
		}

		cycle.setLoue(true);
	}

	public synchronized static void liberer(Cycle cycle) throws Exception {
		if (!cycle.isLoue()) {
			throw new Exception("Ce cycle n'est pas en cours de location");
		}

		cycle.setLoue(false);
	}

}
