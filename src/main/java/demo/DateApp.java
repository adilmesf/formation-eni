package demo;

public class DateApp {

	public static void main(String[] args) {

//		LocalDate date = LocalDate.now();
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("'nous sommes'\' EEEE", Locale.FRANCE);
//		System.out.println("" + date.format(dtf));

		String aAfficher = String.format("ma chaine %s %s %s", "first", "second", "third");

		System.out.printf("ma chaine %s %s %s\n", "first", "second", "third");
		System.out.println(aAfficher);

		StringBuilder sb = new StringBuilder().append("dkskd").append(" ").append(" ")
				.append(String.format("ma chaine %-80s %s %s", "firsdsdsdsdsdsdsddsdt", "second", "third"));

		System.out.println(sb);

	}
}
