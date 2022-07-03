package tp.cycle.part4.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import tp.cycle.part4.bo.Cycle;
import tp.cycle.part4.bo.Velo;
import tp.cycle.part4.bo.comparator.TarifComparator;
import tp.cycle.part4.exception.VeloDejaLoueBusinessException;

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
		return stock.stream()
				.filter(e -> e instanceof Cycle)
				.map(e -> (Cycle) e)
				.sorted(parMarque)
				.collect(Collectors.toList());

	}

	public static <T extends Cycle> List<T> trierParMarque(Class<T> clazz) {

		System.out.println(stock.stream()
				.filter(e -> clazz.isInstance(e))
				.collect(Collectors.toList()));

		return stock.stream().filter(e -> e.getClass().isInstance(clazz)).map(clazz::cast).sorted(parMarque)
				.collect(Collectors.toList());

	}

	public static List<Cycle> getCycleTriesParTarifAsc() {
		return stock.stream()
				.filter(e -> e instanceof Cycle)
				.map(e -> (Cycle) e)
				.sorted(new TarifComparator())
				.collect(Collectors.toList());
	}

	public static List<Cycle> getCycleTriesParTarifDesc() {
		return stock.stream()
				.filter(e -> e instanceof Cycle)
				.map(Cycle.class::cast)
				.sorted(new TarifComparator().reversed()::compare)
				.collect(Collectors.toList());

	}
	

	public static Cycle getCycleDispoLeMoinsCher() {
		return stock.stream()
				.filter(e -> e instanceof Cycle)
				.map(Cycle.class::cast)
				.filter(e -> !e.isLoue())
				.min(new TarifComparator())
				.orElse(null);
	}

	public static Cycle getCycleAcheteLePlusRecemment() {
		return stock.stream()
				.filter(e -> e instanceof Cycle)
				.map(Cycle.class::cast)				
				.max(Comparator.comparing(Cycle::getDateAchat))				
				.orElse(null);
	}

	public static <T> Stream<T> stockFiltre(Class<T> clazz) {
		return stock.stream().filter(e -> clazz.isInstance(e)).map(clazz::cast);
	}

	public static <T extends Cycle> List<T> getTriesParTarifAsc(Class<T> clazz) {
		return stockFiltre(clazz)
				.sorted(Comparator.comparing(Cycle::getTarifLocationHeure))
				.collect(Collectors.toList());
	}

	public static <T extends Cycle> List<T> getTriesParTarifDesc(Class<T> clazz) {
		return stockFiltre(clazz)
				.sorted(new TarifComparator().reversed()::compare)
				.collect(Collectors.toList());

	}

	public static <T extends Cycle> T getDispoLeMoinsCher(Class<T> clazz) {
		return stockFiltre(clazz).min(new TarifComparator()).orElse(null);
	}

	public static <T extends Cycle> T getAcheteLePlusRecemment(Class<T> clazz) {
		return stockFiltre(clazz).min(Comparator.comparing(Cycle::getTarifLocationHeure)).orElse(null);
	}

	public static List<Louable> getArticleDisponible() {
		return stock.stream()
				.filter(e->!e.isLoue())
				.collect(Collectors.toList());
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
