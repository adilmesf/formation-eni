package demo;

import java.util.HashMap;

import tp.tp05.MedecinGeneraliste;

public class MapDemo {

	static HashMap<String, MedecinGeneraliste> hashMap = new HashMap<>();

	public static void main(String[] args) {

		MedecinGeneraliste med = new MedecinGeneraliste("Jean", "", "", null);

		hashMap.put(med.getNom(), med);

		MedecinGeneraliste med2 = new MedecinGeneraliste("Paul", "", "", null);
		hashMap.put(med.getNom(), med2);

		System.out.println(hashMap.size());
		System.out.println(hashMap.get(med.getNom()).getNom());

		hashMap.keySet();
		hashMap.values();

	}

}
