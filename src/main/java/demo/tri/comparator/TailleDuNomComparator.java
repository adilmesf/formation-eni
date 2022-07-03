package demo.tri.comparator;

import java.util.Comparator;

import demo.tri.Ville;

public class TailleDuNomComparator implements Comparator<Ville> {

	@Override
	public int compare(Ville v1, Ville v2) {
		if (v1.nom.length() > v2.nom.length())
			return 1;
		else if (v1.nom.length() < v2.nom.length())
			return -1;
		return 0;
	}
}
