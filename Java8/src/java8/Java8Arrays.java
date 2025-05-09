package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8Arrays {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(1);

		// Print list
		System.out.println(list);

		// Count
		long count = list.stream().count();
		System.out.println("Count: " + count); // 7

		// Min (Comparable FI -> compareTo method)
		Optional<Integer> min = list.stream().min((v1, v2) -> v1.compareTo(v2));
		System.out.println("Max: " + min.get()); // 1

		// Max (Comparable FI -> compareTo method)
		Optional<Integer> max = list.stream().max((v1, v2) -> v1.compareTo(v2));
		System.out.println("Max: " + max.get()); // 4

		// Filter
		list.stream().filter(i -> i % 2 == 0).forEach((i) -> System.out.println("Even Number: " + i));
		
		// Distinct
		List <Integer> distinct= list.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct List" + distinct);
		
		
		// Fetch Second last larger number from list
		// Comparator interface abstract compare method and  reverseOrder static ,ethod
		Optional<Integer> secondLarge =  list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println("Second Large: " + secondLarge);
	}

}
