package week1.day1;

public class Isogram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		
		String s = "ara";
		
		char[] charArray = s.toCharArray();
		
		//char[] charArray = {'A','r','u','n','A'}
		
		
		for(int i=0; i<charArray.length-1; i++)
		{
			for(int j=i+1; j<charArray.length; j++)
			{
				
				if(charArray[i]!=charArray[j])
				{
					continue;
					}
				else
				{
					count++;
					
				}
			}		
		}
		if(count>0)
		{
			System.out.println("Input is not an Isogram");
		}
		else
		{
			System.out.println("Input is an Isogram");
		}
		
	}
	

}


