package tp.cycle.part2.bo;

import java.time.LocalDate;

public class Gyropode extends CycleElectrique {
	private final int tailleMinCm;

	/**
	 * Constructeur de Gyropode
	 * 
	 * @param dateAchat   date d'achat du gyropode
	 * @param marque      marque du gyropode
	 * @param modele      mod�le du gyropode
	 * @param autonomieKm autonomie du moteur en kilom�tres
	 * @param tailleMinCm taille minimale pour piloter le gyropode
	 */
	public Gyropode(LocalDate dateAchat, String marque, String modele, int autonomieKm, int tailleMinCm) {
		super(dateAchat, marque, modele, autonomieKm);
		this.tailleMinCm = tailleMinCm;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see fr.eni.ecole.location.Cycle#getTarifLocationHeure()
	 */
	@Override
	public double getTarifLocationHeure() {
		return 29.9;
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see fr.eni.ecole.location.CycleElectrique#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s [%dm%d min]", super.toString(), this.tailleMinCm / 100, this.tailleMinCm % 100);
	}
}
