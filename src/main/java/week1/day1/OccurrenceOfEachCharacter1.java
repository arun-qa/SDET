package week1.day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurrenceOfEachCharacter1 {
	
	public static void main(String[] args)
	{
		
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	
	String s = "Programming";
	for(int i=0; i<s.length(); i++)
	{
		if(map.containsKey(s.charAt(i))) {
			
			Integer value = map.get(s.charAt(i));
			map.put(s.charAt(i), value+1);
			
		}
		else
		{
			map.put(s.charAt(i), 1);
		}
			
		
	}
	
	System.out.println(map);

}
}
