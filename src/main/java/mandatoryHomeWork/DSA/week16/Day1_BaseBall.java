package mandatoryHomeWork.DSA.week16;

import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class Day1_BaseBall {
	
	/*
	 * https://leetcode.com/problems/baseball-game/ Integer x - Record a new score
	 * of x. '+' - Record a new score that is the sum of the previous two scores.
	 * 'D' - Record a new score that is the double of the previous score. 'C' -
	 * Invalidate the previous score, removing it from the record.
	 * 
	 * Input: ops = ["5","2","C","D","+"]
	 * 
	 * Pseudocode 
	 * Create a stack to store the values
	 * iterate for each loop & check the each string
	 * If string equals "D" multiply prvious value * 2
	 * If string equals "C" remove the last value
	 * If String equals "+" add the previous values
	 * If it is an integer value, convert the value to int and push to stack 
	 * Iterate while loop till it is ! = empty
	 * use pop operation and add each value & return it
	 */
	
	@Test
	public void test1()
	{
		Assert.assertEquals(30, calPoints(new String[] {"5","2","C","D","+"}));
	}

	public int calPoints(String[] operations) {

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < operations.length; i++) {
			String str = operations[i];

			if (str.equals("D")) {
				stack.push(stack.peek() * 2);
			}

			else if (str.equals("C")) {
				stack.pop();
			}

			else if (str.equals("+")) {

				int top = stack.pop();
				int val = top + stack.peek();

				stack.push(top);
				stack.push(val);

			}

			else {
				stack.push(Integer.parseInt(str));
			}
		}
		int points = 0;
		
		while(!stack.isEmpty())
		{
			points = points + stack.pop();
		}
		
		return points;
	}


}
