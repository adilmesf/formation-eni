package tp;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {

	private static final Logger log = LogManager.getLogger(HelloWorld.class);

	static String texte = "dsd";

	public static void main(String[] args) {
		log.info("Hello From Log");
	}

	public static void println(String textToShow) {
		System.out.println(textToShow);
	}

	public static void println(int number) {
		System.out.println(number);
	}
}
