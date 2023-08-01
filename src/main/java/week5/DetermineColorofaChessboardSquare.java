package week5;

import org.junit.Test;

import junit.framework.Assert;

public class DetermineColorofaChessboardSquare {
	
@Test
public void test1()
{
	Assert.assertEquals(false, squareIsWhite("a1"));
}

@Test
public void test2()
{
	Assert.assertEquals(true, squareIsWhite("h3"));
}

@Test
public void test3()
{
	Assert.assertEquals(false, squareIsWhite("c7"));
}
	
	 public boolean squareIsWhite(String coordinates)
	 {
	 int coordinates1 = coordinates.charAt(0)-'`';
     int coordinates2 = coordinates.charAt(1)-'0';
     int total = coordinates1+coordinates2;
     if(total%2==0)
     {
         return false;
     }  
     return true;   
  }
	}


