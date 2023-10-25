package mandatoryHomeWork.DSA.week17;

import org.junit.Test;
import org.testng.Assert;

public class Day3_PlaceFlowers {
	
	//https://leetcode.com/problems/can-place-flowers/description/
	
	@Test
	public void test1()
	{														 
		Assert.assertEquals(true, canPlaceFlowers(new int[] {1,0,0,0,1},1));
	}
	
	@Test
	public void test2()
	{														 
		Assert.assertEquals(true, canPlaceFlowers(new int[] {1,0,0,0,1},1));
	}
	
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            
            if (flowerbed[i] == 0) {
                
                boolean emptyLeftPlot = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRightPlot = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
                
                
                if (emptyLeftPlot && emptyRightPlot) {
                    flowerbed[i] = 1;
                    count++;
                    if (count >= n) {
                        return true;
                    }
                }
            }
        }
        return count >= n;
    }

}
