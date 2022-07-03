package demo.int3rface;

public class Cycle implements Deplacable, Comparable<Cycle> {

	String marque;

	@Override
	public void seDeplacer() {
		System.out.println(this.getClass() + " se déplace");
	}

	@Override
	public int compareTo(Cycle o) {
		if (this.marque.length() > o.marque.length())
			return 1;
		else if (this.marque.length() < o.marque.length())
			return -1;

		return 0;
	}

}
