package week3.day1;

public class ValidPalindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "A man, a plan, a canal: Panama";
		String rev="";
		String lowerCase = input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		//String removeSpace = lowerCase.replaceAll("[^a-zA-Z0-9\\s+]", "");
		String original=lowerCase;
		for(int i=lowerCase.length()-1; i>=0; i--)
		{
			rev=rev+ lowerCase.charAt(i);
		}
		System.out.println(rev);

	}

}
