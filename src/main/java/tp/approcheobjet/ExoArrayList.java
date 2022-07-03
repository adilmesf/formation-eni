package tp.approcheobjet;

import java.util.ArrayList;

public class ExoArrayList {

	public static void main(String[] args) {

		ArrayList<String> fournisseurs = new ArrayList<>();

		ArrayList<Integer> clientsParFournisseurs = new ArrayList<>(); // fournisseurs et clientsParFournisseurs sont
																		// liés par leurs
		// indices.

		String[] emails = { "aaa@wanadoo.fr", "bfb@libertysurf.fr", "fdfd@aol.fr", "bfb@libertysurf.fr", "fdfd@aol.fr",
				"aaa@wanadoo.fr", "zzz@wanadoo.fr" };
		int positionArobase;
		String fournisseur;
		int indiceFournisseur;

		for (int i = 0; i < emails.length; i++) {
			positionArobase = emails[i].indexOf("@");
			fournisseur = emails[i].substring(positionArobase + 1);
			System.out.println(fournisseur);

			if (fournisseurs.contains(fournisseur)) {
				indiceFournisseur = fournisseurs.indexOf(fournisseur);
				clientsParFournisseurs.set(indiceFournisseur, clientsParFournisseurs.get(indiceFournisseur) + 1);

			} else {
				// nouveau fournisseur
				fournisseurs.add(fournisseur);
				clientsParFournisseurs.add(1);
			}
		}

		System.out.println(fournisseurs);
		System.out.println(clientsParFournisseurs);

	}
}
