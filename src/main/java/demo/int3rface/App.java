package demo.int3rface;

public class App {

	static MoteurDeJeu moteurDeJeu = new MoteurDeJeu();

	public static void main(String[] args) {

		Velo velo = new Velo();

		moteurDeJeu.deplacer(velo);
		moteurDeJeu.deplacer(new Cailloux());
		moteurDeJeu.deplacer(new Voiture());
	}

}
