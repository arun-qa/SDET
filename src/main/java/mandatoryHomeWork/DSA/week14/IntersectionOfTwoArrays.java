package mandatoryHomeWork.DSA.week14;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class IntersectionOfTwoArrays {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(new int[] {2,2}, intersect(new int[] {1,2,2,1}, new int[] {2,2}));
	}
	
	
		
	public int[] intersect(int[] nums1, int[] nums2) {

			// https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
			//Pseudocode
			// Get an input as int[] , int[] and output should be int[]
			// Sort both input arrays nums1 and nums2.
			// Initialize two pointers i and j to 0 to traverse through nums1 and nums2
			// If nums1[i] equals nums2[j], add it to the result list, and increment both i
			// and j.
			// If nums1[i] is less than nums2[j], increment i.
			// If nums1[i] is greater than nums2[j], increment j.
			// Convert the result list to an array and return it.

			Arrays.sort(nums1);
			Arrays.sort(nums2);
			ArrayList<Integer> list = new ArrayList<>();
			int i = 0;
			int j = 0;

			while (i < nums1.length && j < nums2.length) {
				if (nums1[i] == nums2[j]) {
					list.add(nums1[i]);
					i++;
					j++;
				} else if (nums1[i] < nums2[j]) {
					i++;
				} else {
					j++;
				}
			}
			int[] output = new int[list.size()];
			int index = 0;
			for (int num : list) {
				output[index++] = num;
			}
			return output;
		}


	}
		
		
	
		
	

	