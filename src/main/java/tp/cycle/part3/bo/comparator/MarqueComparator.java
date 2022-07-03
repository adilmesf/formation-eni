package tp.cycle.part3.bo.comparator;

import java.util.Comparator;

import tp.cycle.part3.bo.Cycle;

public class MarqueComparator implements Comparator<Cycle> {

	@Override
	public int compare(Cycle o1, Cycle o2) {
		return o1.getMarque().compareTo(o2.getMarque());
	}
}
