package tp.cycle.part4.bo;

import tp.cycle.part4.service.Louable;

public class Casque implements Louable {

	int taille;

	boolean isLoue = false;

	@Override
	public boolean isLoue() {
		return isLoue;
	}

	@Override
	public void setLoue(boolean b) {
		this.isLoue = b;
	}

}
