package mandatoryHomeWork.DSA.week17;

import org.junit.Assert;
import org.junit.Test;

public class Day4_FlippingImage {
	
	@Test
	public void test1()
	{
Assert.assertArrayEquals(new int[][] {{1, 0, 0}, {0, 1, 0}, {1, 1, 1}}, 
	flipAndInvertImage(new int[][] {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}}));
		
	}
	
	public int[][] flipAndInvertImage(int[][] image) {

        int n=image.length;
        System.out.println(n);
        int [][]ans=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(image[i][j]==0)
                {
                    ans[i][n-j-1]=1;
                }
                else
                {
                    ans[i][n-j-1]=0;
                }
            }
        }
        return ans;
        
    }

}
