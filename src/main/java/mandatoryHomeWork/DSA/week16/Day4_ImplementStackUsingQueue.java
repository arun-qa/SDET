package mandatoryHomeWork.DSA.week16;

import java.util.ArrayDeque;
import java.util.Deque;

public class Day4_ImplementStackUsingQueue {
	
	class MyStack {

	    Deque<Integer> queue;


	    public MyStack() {

	            queue = new ArrayDeque<Integer>();      
	    }
	    
	    public void push(int x) {

	        queue.addFirst(x);
	        
	    }
	    
	    public int pop() {

	        return queue.remove();
	        
	    }
	    
	    public int top() {

	            return  queue.peek();       
	    }
	    
	    public boolean empty() {
	        
	        return queue.isEmpty();
	    }
	}


}
