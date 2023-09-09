package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;
import org.testng.Assert;

//Pseudocode
//Get an input as String 
//Output should be int
//intialise two counter variables and assign it as 0
//while i is less than s.length then create the substring sub and take the substring of i & i+3th position
//check if the char at 0th position is not equal to S then increase the count by 1
//check if the char at 1st position is not equal to O then increase the count by 1
//check if the char at 2nd position is not equal to S then increase the count by 1
//Increase the i value bu i=i+3; then finally return the count

public class MarsExploration {

	@Test
	public void test1() {
		Assert.assertEquals(2, marsExploration("SOTSOT"));
	}

	@Test
	public void test2() {
		Assert.assertEquals(6, marsExploration("TTTTTT"));
	}

	@Test
	public void test3() {
		Assert.assertEquals(0, marsExploration("SOSSOSSOS"));
	}

	public static int marsExploration(String s) {

		int count = 0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i += 3) {
			if (ch[i] != 'S') {
				count++;
			}
			if (ch[i + 1] != 'O') {
				count++;
			}
			if (ch[i + 2] != 'S') {
				count++;
			}

		}
		return count;
	}

}
