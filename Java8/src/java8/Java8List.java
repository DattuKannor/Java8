package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8List {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,3,4};
		// Print list
		System.out.println(arr);

		// Count
		long count = Arrays.stream(arr).count();
		System.out.println("Count: " + count); // 7

		// Min 
		int min = Arrays.stream(arr).min().getAsInt();
		System.out.println("Max: " + min); // 1

		// Max
		int max = Arrays.stream(arr).max().getAsInt();
		System.out.println("Max: " + max); // 4

		// Filter
		Arrays.stream(arr).filter(i -> i % 2 == 0).forEach((i) -> System.out.println("Even Number: " + i));
		
		// Distinct and toArray
		int distinct[]=Arrays.stream(arr).distinct().toArray();
		System.out.println("Distinct List" + distinct);
		
		
		// Fetch Second last larger number from list
		// Comparator interface abstract compare method and  reverseOrder static ,ethod
		int secondLarge[] =  Arrays.stream(arr).distinct().sorted().toArray();
		System.out.println("Second Large: " + secondLarge);
	}

}
