package tp.approcheobjet.bnb;

/**
 * 
 * La Terre est unique.
 *
 */
public class Terre {

	private static Terre instance;

	private Terre() {

	}

	public synchronized static Terre instance() {
		if (instance == null) {
			instance = new Terre();
		}
		return instance;
	}

}
