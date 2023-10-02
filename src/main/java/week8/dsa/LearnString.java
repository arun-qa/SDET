package week8.dsa;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String takes 64bit of memory
		
		// Type 1 ==> String Literal ==> Faster in performance when comparing to type 2
		String text1 = "Arun";
		
		//String text2 = "Arun";
		
		//Type 2 ==> String using object
		String text2 = new String("Arun");
		
		String text3 = "  My Native Is Parigam   ";
		
		System.out.println(text1.toLowerCase());
		
		System.out.println(text1 + text2); // + operator we can concat any datatypes
		
		System.out.println(text1.concat(text2)); //concat method will concat only with String datatype
		
		System.out.println(text1 == text2);
		
		System.out.println(text1.equals(text2));
		
		System.out.println(text1.equalsIgnoreCase(text2));
		
		System.out.println(text1=text2);
		
		System.out.println(text3.contains(" "));
		
		System.out.println(text3);
		
		System.out.println(text3.trim());//remove the space available in front and back

		System.out.println(text3.substring(4, 12));
		
		StringBuilder sb = new StringBuilder("I am in SB");
		
		System.out.println(sb);
		
		System.out.println(sb.append("test"));
		
		System.out.println(sb.insert(0, 1));
	}

}
