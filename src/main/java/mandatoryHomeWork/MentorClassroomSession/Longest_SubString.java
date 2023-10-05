package mandatoryHomeWork.MentorClassroomSession;

import java.util.HashSet;

import org.junit.Test;
import org.testng.Assert;

public class Longest_SubString {

	@Test
	public void test1() {
		Assert.assertEquals(3, lengthOfLongestSubstring("abcabcbb"));
	}

	@Test
	public void test2() {
		Assert.assertEquals(1, lengthOfLongestSubstring("bbbbb"));
	}

	@Test
	public void test3() {
		Assert.assertEquals(14, lengthOfLongestSubstring("bbbbbdefgh ijklmno"));
	}

	public int lengthOfLongestSubstring(String s) {
		HashSet set = new HashSet<>();
		int left = 0, right = 0, maxlength = 0;
		while (right < s.length()) {
			if (!set.contains(s.charAt(right))) {
				set.add(s.charAt(right));
				right++;
				maxlength = Math.max(maxlength, right - left);

			} else {
				set.remove(s.charAt(left));
				left++;
			}
		}

		return maxlength;

	}
}
