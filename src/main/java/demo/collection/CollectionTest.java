package demo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import demo.int3rface.Cycle;

public class CollectionTest {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("aa");
		set.add("bb");
		set.add("cc");
		set.add("dd");
		set.add("aaaa");
		set.add("bbbb");
		set.add("cccc");
		set.add("dddd");
		set.add("a&");
		set.add("b&");
		set.add("c&");
		set.add("d&");

		set.forEach((s) -> System.out.println(s)); // ordre non respecté

		set = new HashSet<>();
		// Collections.sort(set); // ne compile pas, un set n'est pas triable

		List<String> arrayList = new ArrayList<String>();

		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("d");
		arrayList.add("aa");
		arrayList.add("bb");
		arrayList.add("cc");
		arrayList.add("dd");
		arrayList.add("aaaa");
		arrayList.add("bbbb");
		arrayList.add("cccc");
		arrayList.add("dddd");
		arrayList.add("a&");
		arrayList.add("b&");
		arrayList.add("c&");
		arrayList.add("d&");
		arrayList.forEach((s) -> System.out.println(s)); // ordre respecté

		Collections.sort(arrayList);

		List<Cycle> cycles = new ArrayList<>();
		Collections.sort(cycles);

	}

}
