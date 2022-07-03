package demo.lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		Consumer<String> lambdaPrint = (param) -> System.out.println("Hello World " + param);

		lambdaPrint.accept("hey");
		lambdaPrint.accept("hey2");
		lambdaPrint.accept("hey3");

		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		Function<Integer, Boolean> lambdaIsPositif = (entier) -> entier > 0;

		System.out.println(lambdaIsPositif.apply(5));

		List<String> strings = List.of("toto", "tata", "titi");

		List<String> streamed = strings.stream().filter(e -> e.length() > 2).sorted((o1, o2) -> o1.compareTo(o2))
				.collect(Collectors.toList());

		System.out.println(streamed);

		System.out.println(List.of(1, 2, 3, 4, 5).stream().min(Integer::compareTo).orElse(null));

		System.out.println(List.of(1, 2, 3, 4, 5).stream().min((e1, e2) -> Integer.compare(e1, e2))

				.orElseGet(() -> 1 + 1));

		/**
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
