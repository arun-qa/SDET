package mandatoryHomeWork.DSA.week14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class Day1_DestinationCity {

	/*
	 * https://leetcode.com/problems/destination-city/description/ 
	 * Pseudocode
	 * Create HashSet 
	 * Iterate the List of strings and add the index o
	 * values into set 
	 * Iterate one more for loop and check the string does not
	 * contains the index of 1 in existing set if so return the value
	 * 
	 * Time Complexity --> O(n)
	 * Space Complexity --> O(n)
	 */

	@Test
	public void test1() {
		String destinationCity = destCity(
				Arrays.asList(Arrays.asList("B", "C"), Arrays.asList("D", "B"), Arrays.asList("C", "A")));
		System.out.println(destinationCity);

	}

	public String destCity(List<List<String>> paths) {

		Set<String> set = new HashSet();

		for (List<String> path : paths) {
			set.add(path.get(0));
		}

		for (List<String> path : paths) {
			if (!set.contains(path.get(1))) {
				return path.get(1);
			}

		}
		return null;
	}
}
