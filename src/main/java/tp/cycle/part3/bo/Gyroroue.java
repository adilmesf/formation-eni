package tp.cycle.part3.bo;

import java.time.LocalDate;

public class Gyroroue extends CycleElectrique {

	/**
	 * Constructeur
	 * 
	 * @param dateAchat   date d'achat du gyroroue
	 * @param marque      marque du gyroroue
	 * @param modele      modèle du gyroroue
	 * @param autonomieKm autonomie du moteur en kilomètres
	 */
	public Gyroroue(LocalDate dateAchat, String marque, String modele, int autonomieKm) {
		super(dateAchat, marque, modele, autonomieKm);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.eni.ecole.location.Cycle#getTarifLocationHeure()
	 */
	@Override
	public Double getTarifLocationHeure() {
		return 18.9;
	}

}
