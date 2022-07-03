package demo.visibility.b;

import java.util.Random;

import demo.visibility.MoyenDeTransport;

public class Voiture extends MoyenDeTransport {

	private String marque; // package
	private String couleur;
	private int puissance;
	protected boolean roueDeSecours;

	public static Random rand;

	public static Random getRand() {
		return Voiture.rand;
	}

	public static void setRand(Random rand) {
		Voiture.rand = rand;
	}

	public Voiture() {
		super.calculerEmissionCO2();
		// TODO super.super
	}

	public Voiture(String marque, String couleur, int puissance, boolean roueDeSecours) {
		this(marque, couleur);
		this.puissance = puissance;
		this.roueDeSecours = roueDeSecours;
	}

	public Voiture(String marque, String couleur) {
		super("rapide");
		this.marque = marque;
		this.couleur = couleur;
		super.calculerEmissionCO2();
	}

	@Override
	public void calculerEmissionCO2() {

		System.out.println("co2 voiture");
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public boolean isRoueDeSecours() {
		return roueDeSecours;
	}

	public void setRoueDeSecours(boolean roueDeSecours) {
		this.roueDeSecours = roueDeSecours;
	}

}
