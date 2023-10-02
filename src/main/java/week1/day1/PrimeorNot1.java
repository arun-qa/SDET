package week1.day1;

public class PrimeorNot1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 7;
		
		int count = 0;
		
		for(int i=2; i<a; i++)
		{
			if(a%i==0)
			{
				count++;
			}
		}
		
		if(count>0)
		{
			System.out.println("Its not an prime");
		}
		else {
			System.out.println("Its an Prime");
		}

	}

}
