package mandatoryHomeWork.DSA.week16;

import java.util.LinkedList;
import java.util.Queue;

public class Day3_NumberofRecentCalls {

	public Queue<Integer> queue;

	public Day3_NumberofRecentCalls() {

		queue = new LinkedList<>();
	}

	public int ping(int t) {

		queue.add(t);

		while (queue.peek() < t - 3000) {
			queue.poll();
		}

		return queue.size();
	}

}


/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */