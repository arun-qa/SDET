package mandatoryHomeWork.DSA;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/*https://leetcode.com/problems/decode-the-message/
	
	Psuedocode : 
		1. Get the key and the message string
		2. Iterate through the characters in the key to construct mapping to the english alphabet(lower case)
		3. Consider only the first appearance for the above mapping
		4. Map the characters in the message according to the constructed mapping*/

//Time Complexity : O(n*m)
		 

public class Week_10_DecodeTheMessage {
	
	@Test
	public void test1() {
		String key = "the quick brown fox jumps over the lazy dog";
		String message = "vkbs bs t suepuv";
		String expOutput = "this is a secret";
		String actOutput = decodeMessage(key,message);
		Assert.assertEquals(expOutput, actOutput);
	}


	private String decodeMessage(String key, String message) {
		
		Map<Character, Character> keyMap = new HashMap<Character, Character>();
		String s = key.replace(" ", "");
		char letter = 'a';
		for(int i=0;i<s.length();i++) { //0[N]
			char c = s.charAt(i);
			if(!keyMap.containsKey(c)) {
				keyMap.put(c, letter);
				letter =(char)(letter + 1);
				
			}
		}
		
		String result = "";
		for(int j=0;j<message.length();j++) { //O[M]
			char messageChar = message.charAt(j);
			if(keyMap.containsKey(messageChar)) {
				result = result + keyMap.get(messageChar);	
			}
			else result = result + messageChar;
		}
		
		return result;
	}
	
	

}
