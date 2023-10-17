package mandatoryHomeWork.DSA.week16;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

import junit.framework.Assert;

public class Day2_TimeNeededToBuyTickets {
	
	/* https://leetcode.com/problems/time-needed-to-buy-tickets/
	 * 
	 * Pseudocode
	 * Create a queue
	 * Iterate for loop till tickets.length, add each value of i in queue
	 * Initiate count as 0, 
	 * Iterate while loop till the queue is != empty
	 * increment the count
	 * Initiate int variable and store queue.poll
	 * check the ticket value if greater than then reduce the value by 1
	 * check the k and int variable values are same, if so break the loop
	 * else continue 
	 * return count
	 * 
	 */

	@Test
	public void test1() {
		Assert.assertEquals(6, timeRequiredToBuy(new int[] { 2, 3, 2 }, 2));
	}

	public int timeRequiredToBuy(int[] tickets, int k) {

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < tickets.length; i++) {
			queue.add(i);
		}

		int count = 0;
		while (!queue.isEmpty()) {
			count++;

			int front = queue.poll();

			if (tickets[front] >= 1) {
				tickets[front] -= 1;
			}

			if (k == front && tickets[front] == 0) {
				break;
			}

			if (k != front && tickets[front] == 0) {
				continue;
			}

			queue.add(front);

		}

		return count;
		

	}

}
