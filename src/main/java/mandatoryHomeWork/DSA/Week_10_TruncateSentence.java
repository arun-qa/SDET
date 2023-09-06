package mandatoryHomeWork.DSA;

import org.junit.Test;
import org.testng.Assert;

public class Week_10_TruncateSentence {
	
/*	https://leetcode.com/problems/truncate-sentence/
		
	Pseudocode:
	- Get an inputs as String and int
	- Output should be String
	- Split the sentence using space " " and store it in string array
	- Iterate for loop till length of k
	- Append the String[] value one by one in empty string 
	
	Time Complexity : O(n) */
	
	@Test
	public void test1()
	{
		Assert.assertEquals("Hello how are you", truncateSentence("Hello how are you Contestant",4));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("chopper is not a tanuki", truncateSentence("chopper is not a tanuki",5));
	}

	public String truncateSentence(String s, int k) {

        String[] s1 = s.split(" ");

        String empty = "";

        for(int i=0; i<k; i++) //O(n)
        {
            empty = empty +" "+s1[i];
        }

        return empty.trim();
        
    }

}
