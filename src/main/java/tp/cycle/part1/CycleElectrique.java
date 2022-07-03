package tp.cycle.part1;

import java.time.LocalDate;

public abstract class CycleElectrique extends Cycle {
	private int autonomieKm;

	public CycleElectrique() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur de CycleElectrique
	 * 
	 * @param dateAchat   date d'achat du cycle
	 * @param marque      marque du cycle
	 * @param modele      mod�le du cycle
	 * @param autonomieKm autonomie du moteur en kilom�tres
	 */
	public CycleElectrique(LocalDate dateAchat, String marque, String modele, int autonomieKm) {
		super(dateAchat, marque, modele);
		this.autonomieKm = autonomieKm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see fr.eni.ecole.location.Cycle#toString()
	 */
	@Override
	public String toString() {
		return String.format("%s %d km d'autonomie", super.toString(), this.autonomieKm);
	}
}
