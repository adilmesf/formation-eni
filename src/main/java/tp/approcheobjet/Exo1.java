package tp.approcheobjet;

import java.util.Arrays;

public class Exo1 {

	public static void main(String[] args) {

		String[] fournisseurs = new String[0];
		int[] clientsParFournisseurs = new int[0]; // fournisseurs et clientsParFournisseurs sont liés par leurs
													// indices.

		String[] emails = { "aaa@wanadoo.fr", "bfb@libertysurf.fr", "fdfd@aol.fr", "bfb@libertysurf.fr", "fdfd@aol.fr",
				"aaa@wanadoo.fr", "zzz@wanadoo.fr" };

		for (int i = 0; i < emails.length; i++) {
			int positionArobase = emails[i].indexOf("@");
			String fournisseur = emails[i].substring(positionArobase + 1);
			System.out.println(fournisseur);

			int indexFournisseur = findIndex(fournisseurs, fournisseur);
			if (indexFournisseur > -1) {
				clientsParFournisseurs[indexFournisseur]++;
			} else {
				// nouveau fournisseur
				fournisseurs = Arrays.copyOf(fournisseurs, fournisseurs.length + 1);
				clientsParFournisseurs = Arrays.copyOf(clientsParFournisseurs, clientsParFournisseurs.length + 1);

				fournisseurs[fournisseurs.length - 1] = fournisseur;
				clientsParFournisseurs[clientsParFournisseurs.length - 1] = 1;

			}
		}
		System.out.println(Arrays.toString(fournisseurs));
		System.out.println(Arrays.toString(clientsParFournisseurs));

	}

	/**
	 * 
	 * @param fournisseurs
	 * @param fournisseur
	 * @return retourne l'indice de l'élément recherché.
	 */
	public static int findIndex(String[] fournisseurs, String fournisseur) {
		int indexElementRechercher = -1;
		for (int i = 0; i < fournisseurs.length && indexElementRechercher < 0; i++) {
			String fournisseurCourant = fournisseurs[i];
			if (fournisseurCourant.equals(fournisseur)) {
				indexElementRechercher = i;
			}
		}
		return indexElementRechercher;
	}

}
