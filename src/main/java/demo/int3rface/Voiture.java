package demo.int3rface;

public class Voiture implements Deplacable {

	@Override
	public void seDeplacer() {
		System.out.println(this.getClass() + " se déplace vite mais pollue");
	}
}
