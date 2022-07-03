package tp.cycle.part4.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import tp.cycle.part4.bo.Velo;
import tp.cycle.part4.exception.VeloDejaLoueBusinessException;

public class LocationServiceTest {

	@Test
	@DisplayName("je d�couvre JUnit")
	public void test() {
		ArrayList<String> listA = new ArrayList(Arrays.asList("a", "b", "c"));
		ArrayList<String> listB = new ArrayList(Arrays.asList("a", "b", "c"));
		assertEquals(listA, listB, () -> "Les listes sont diff�rentes");
	}
	
	@Test
	@DisplayName("on ne peut pas louer un v�lo d�j� lou�")
	public void testVeloDejaLoue() {
		assertThrows(VeloDejaLoueBusinessException.class, () -> {
			Velo velo = new Velo(LocalDate.now(), "marque", "modele", 1);
			LocationService.louer(velo);
			LocationService.louer(velo);
		}, () -> "il semble que l'on puisse louer deux fois le m�me v�lo...");
	}
	
	
	@Test
	@DisplayName("on ne peut louer un velo disponible")
	public void testLouerVelo() {
		
	}
	
	@Test
	@DisplayName("on ne lib�rer un v�lo lou�")
	public void testLibererVelo() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
