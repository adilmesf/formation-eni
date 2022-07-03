package demo.heritage;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<String> liste = new ArrayList<>();

		Velo velo = new Velo();
		Scooter scooter = new Scooter();
		VeloElectrique ve = new VeloElectrique();

		System.out.println(velo);
		System.out.println((Cycle) velo);
		System.out.println((Cycle) ve);
		System.out.println((Velo) ve);
//		System.out.println((VeloElectrique) velo);

		Cycle cycle = ve;
		System.out.println(cycle);

		if (ve instanceof VeloElectrique) {
			System.out.println("ve est un vélo electrique");
		}

		if (ve instanceof Velo) {
			System.out.println("ve est un vélo");
		}

		if (ve instanceof Cycle) {
			System.out.println("ve est un cycle");
		}

		Cycle cycleVE = ve;
		VeloElectrique ve2 = (VeloElectrique) cycleVE;

		System.out.println((VeloElectrique) cycleVE);

		Cycle monVelo = new VeloElectrique();

		if (monVelo instanceof VeloElectrique) {
			System.out.println("monVelo est un vélo electrique");
		}

	}

}
