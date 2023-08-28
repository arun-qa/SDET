package mandatoryHomeWork.Foundation;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class W8_Q5_Cookies {
	
	/*Psuedocode : 
		1. Get the greed factor array 'g' and the cookies array 's'
		2. Initialize an integer variable as 'count' and assign it to 0
		2. Use two for loops(i & j) to iterate through 's' array and 'j' array
		3. For each iteration, Do an entry check whether the current index value of s is greater than 0 or not
		4. if true, for each index of s, iterate through all the index of g
		5. check whether s[i]>=g[j]
		6. if the above step returns true, set both s[i] and g[j] to 0 and increment the count by1
		7. return the counter value
		 */
	
	@Test
	public void test1()
	{
		Assert.assertEquals(2, findContentChildren(new int[] {1,2}, new int[] {1,2,3}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(1, findContentChildren(new int[] {1,2,3}, new int[] {1,1}));
	}
	
	public int findContentChildren(int[] g, int[] s)
	{
		int count=0;

        for(int i=0; i<s.length; i++)
        {
            for(int j=0; j<g.length; j++)
            {
            	if(g[j]>0 && s[i]>=g[j]) {
					g[j]=0;
					s[i]=0;
					count = count + 1;
				}			
            }
        }

        return count;
				
	}

}
