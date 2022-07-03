package demo.tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import demo.tri.comparator.OrdreAlphabetiqueComparator;
import demo.tri.comparator.TailleDuNomComparator;

public class TriTest {

	public static void main(String[] args) {

		List<Ville> villes = new ArrayList<>();
		villes.add(new Ville("Angers", 151520));
		villes.add(new Ville("Nantes", 303382));
		villes.add(new Ville("Rennes", 215366));

		Collections.sort(villes); // tri par défaut, via l'interface Comparable
		System.out.println(villes);

		Collections.sort(villes, new OrdreAlphabetiqueComparator());
		System.out.println(villes);

		Collections.sort(villes, new TailleDuNomComparator());
		System.out.println(villes);

	}
}
