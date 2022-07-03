package tp.cycle.part3.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import tp.cycle.part3.bo.Cycle;
import tp.cycle.part3.bo.Velo;
import tp.cycle.part3.bo.comparator.TarifComparator;
import tp.cycle.part3.exception.VeloDejaLoueBusinessException;

public class LocationService {

	private static List<Louable> stock;

	public static Comparator<Cycle> parMarque = new Comparator<>() {
		@Override
		public int compare(Cycle o1, Cycle o2) {
			return o1.getMarque().compareTo(o2.getMarque());
		}
	};

	static {
		stock = new ArrayList<Louable>();
	}

	@SuppressWarnings("unchecked")
	public static <T> List<T> filtrer(Class<T> clazz) {
		List<T> cycles = new ArrayList<T>();
		for (Louable louable : stock) {
			if (clazz.isInstance(louable)) {
				cycles.add((T) louable);
			}
		}
		return cycles;
	}

	public static List<Cycle> getCycleTriesParMarque() {
		List<Cycle> cycles = filtrer(Cycle.class);
		Collections.sort(cycles, parMarque);
		return cycles;
	}

	public static List<Cycle> getCycleTriesParTarifAsc() {
		List<Cycle> cycles = filtrer(Cycle.class);
		Collections.sort(cycles, new Comparator<Cycle>() {
			@Override
			public int compare(Cycle o1, Cycle o2) {
				// TODO Auto-generated method stub
				return o1.getTarifLocationHeure().compareTo(o2.getTarifLocationHeure());
			}
		});
		return cycles;
	}

	public static List<Cycle> getCycleTriesParTarifDesc() {
		List<Cycle> ret = getCycleTriesParTarifAsc();
		Collections.reverse(ret);
		return ret;

	}

	public static Cycle getCycleDispoLeMoinsCher() {
		List<Cycle> cycles = filtrer(Cycle.class);
		List<Cycle> cyclesDispo = new ArrayList<Cycle>();
		for (Cycle cycle : cycles) {
			if (!cycle.isLoue()) {
				cyclesDispo.add(cycle);
			}
		}

		return Collections.min(cyclesDispo, new TarifComparator());
	}

	public static void ajouter(Louable cycle) {
		stock.add(cycle);
	}

	public static void ajouterTout(List<? extends Louable> cycles) {
		stock.addAll(cycles);
	}

	public synchronized static void louer(Louable articleLouable) throws VeloDejaLoueBusinessException {
		if (articleLouable.isLoue()) {
			throw new VeloDejaLoueBusinessException("Cycle déjà loué");
		}

		articleLouable.setLoue(true);
	}

	public synchronized static void liberer(Louable articleLouable) throws Exception {
		if (!articleLouable.isLoue()) {
			throw new Exception("Ce cycle n'est pas en cours de location");
		}

		articleLouable.setLoue(false);
	}

	public static List<Louable> getArticleDisponible() {
		List<Louable> louables = new ArrayList<>();
		for (Louable louable : stock) {
			if (louable.isLoue() == false) {
				louables.add(louable);
			}
		}
		return louables;
	}

	public static List<Louable> getVeloDisponible() {
		List<Louable> louables = new ArrayList<>();
		for (Louable louable : stock) {
			if (louable instanceof Velo && louable.isLoue() == false) {
				louables.add(louable);
			}
		}
		return louables;
	}

	public static List<Louable> getLouableDisponible(Class<? extends Louable> clazz) {
		List<Louable> louables = new ArrayList<>();
		for (Louable louable : stock) {
			if (louable.getClass() == clazz && louable.isLoue() == false) {
				louables.add(louable);
			}
		}
		return louables;
	}

	/******
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

}
