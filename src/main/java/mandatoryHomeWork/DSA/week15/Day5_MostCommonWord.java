package mandatoryHomeWork.DSA.week15;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import junit.framework.Assert;

public class Day5_MostCommonWord {
	
		//https://leetcode.com/problems/most-common-word/description/
		//Get an input as String, String[] & ouput as String
		//Initiate a hashmap and store the frequency of eachword
		//Iterate foreach loop for all elements of banned array and remove it from hashmap		
		//Initiate two variables String res as "" & value as 0
		//Iterate one more foreach loop for all elements of map, if the entry value is greater than value then assign it to value store the respective key in result
		//return result
		//TC : O[N], SC: O[N]
	
	@Test
	public void test1()
	{
		Assert.assertEquals("ball", mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit." , new String[] {"hit"}));
	}
		

		public String mostCommonWord(String paragraph, String[] banned) {
	        String[] arr = paragraph.replaceAll("[!?';.,]","").toLowerCase().split("\\s+");
	        HashMap<String, Integer> map = new HashMap<>();
	        
	        for(String s :arr) {
	        	map.put(s, map.getOrDefault(s, 0)+1);
	        }
	        
	        for(String ban :banned) {
	        	map.remove(ban);
	        }
	   
	        Integer value = 0;
	        String result = "";
	        
	        for (Map.Entry<String, Integer> entry : map.entrySet()) {
				if(entry.getValue()>value) {
					value=entry.getValue();
					result = entry.getKey();
				}
			}
	         return result;       
	                
	    }	 
		 
		
	}


