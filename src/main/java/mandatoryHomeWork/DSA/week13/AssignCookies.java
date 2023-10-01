package mandatoryHomeWork.DSA.week13;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class AssignCookies {

	/*
	 * https://leetcode.com/problems/assign-cookies/description/
	 * 
	 * Psuedocode Get an input as children-int[], cookies-int[] initiate i, j, count
	 * Iterate while loop till i less than g.length & j less than s.length If
	 * cookies greater than greed the increment the counter
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int[] g = { 1, 2, 3, 4, 5 };
		int[] s = { 1, 2, 5 };

		 	Arrays.sort(g);
	        Arrays.sort(s);
	        int count = 0;
	        int i = 0;
	        int j = 0;
	        while(i < g.length && j < s.length){
	            if(s[j] >= g[i]){
	                count++;
	                i++;
	            }
	            j++; 
	        }
	        
	        System.out.println(count);
		}
		
	}


