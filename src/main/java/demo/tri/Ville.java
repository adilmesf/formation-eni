package demo.tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ville implements Comparable<Ville> {

	public String nom;

	public Long population;

	public Ville(String nom, long population) {
		super();
		this.nom = nom;
		this.population = population;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ville [nom=").append(nom).append(", population=").append(population).append("]");
		return builder.toString();
	}

	/**
	 * Algo de comparaison aléatoire
	 */
	public int compareTo(Ville o) {

		int resultatComparaison = new Random().nextInt(2);
		return switch (resultatComparaison) {
		case 0 -> 1; // plus grand
		case 1 -> -1; // plus petit
		default -> 0; // egaux
		};
	}

	public static void main(String[] args) {
		List<Ville> villes = new ArrayList<>();
		villes.add(new Ville("Angers", 151520));
		villes.add(new Ville("Nantes", 303382));
		villes.add(new Ville("Rennes", 215366));

		Collections.sort(villes);

		System.out.println(villes);

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
	 */
}
