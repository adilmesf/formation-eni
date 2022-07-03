package demo.tri.comparator;

import java.util.Comparator;

import demo.tri.Ville;

public class OrdreAlphabetiqueComparator implements Comparator<Ville> {

	@Override
	public int compare(Ville v1, Ville v2) {
		return v1.nom.compareTo(v2.nom);
	}
}
