package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;

import junit.framework.Assert;

public class MaximumNumberofWordsFoundinSentences {
	
	@Test
	public void test1()
	{
		Assert.assertEquals(6, mostWordsFound(new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(3, mostWordsFound(new String[] {"please wait", "continue to fight", "continue to win"}));
	}

	public int mostWordsFound(String[] sentences) {

		int max = 0;

		for (int i = 0; i < sentences.length; i++) {
			String sentence = sentences[i];
			int count = 1;

			for (int j = 0; j < sentence.length(); j++) {
				char ch = sentence.charAt(j);

				if (ch == ' ') {
					count++;

				}

			}
			if (count > max)
				max = count;
		}
		return max;
	}
}
