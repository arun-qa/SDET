package mandatoryHomeWork.MentorClassroomSession;

public class Count_Asteriks {
	
	/* https://leetcode.com/problems/count-asterisks/description/
	 * 1. Declare the verticalBar=0,asterisksCount=0
	 * 2. Iterate with string
	 * 3. check for the condition whether the character is '|'  If yes then verticalBar++;
	 * 4. check for the condition verticalBar%2==0 if yes the asterisksCount++
	 * 
	 * Time Complexity--->o[n] 		
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "l|*e*et|c**o|*de|";

		int verticalbar = 0;

		char[] charArray = s.toCharArray();

		int asteriskscount = 0;

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '|') {
				verticalbar++;
			}

			if (verticalbar % 2 == 0) {
				if (charArray[i] == '*')

					asteriskscount++;

			}
		}

		System.out.println(asteriskscount);

	}

}
