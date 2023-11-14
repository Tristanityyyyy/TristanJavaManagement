package package1;
import java.util.*;

public class Tristan {
		
	public static void main(String[] args) throws InterruptedException {
		Queue <String> queue = new LinkedList<String>();
		Stack <String> stack1 = new Stack<String>();
		Stack <String> stack2 = new Stack<String>();
		Stack <String> stack3 = new Stack<String>();
		Stack <String>stack4 = new Stack<String>();
		Stack <String>stack5 = new Stack<String>();
	
		Queue<String> queue1 = new LinkedList<String>();
		Queue<String> queue2 = new LinkedList<String>();
		Queue<String> queue3 = new LinkedList<String>();
	 	Queue<String> queue4 = new LinkedList<String>();
	 	Queue<String> queue5 = new LinkedList<String>();
	 	Scanner scn = new Scanner(System.in);
	 	System.out.println("Enter your arranged number: ");
	 	
		for (int i = 1; i <= 20; i++) {
			queue.offer(scn.nextLine());
		}
		System.out.println(queue);
		
		queue1.offer(queue1.poll());
		queue1.offer(queue1.poll());
		queue1.offer(queue1.poll());
		queue1.offer(queue1.poll());
		
		queue2.offer(queue2.poll());
		queue2.offer(queue2.poll());
		queue2.offer(queue2.poll());
		queue2.offer(queue2.poll());
		
		queue3.offer(queue3.poll());
		queue3.offer(queue3.poll());
		queue3.offer(queue3.poll());
		queue3.offer(queue3.poll());
		
		queue4.offer(queue4.poll());
		queue4.offer(queue4.poll());
		queue4.offer(queue4.poll());
		queue4.offer(queue4.poll());
		
		queue5.offer(queue5.poll());
		queue5.offer(queue5.poll());
		queue5.offer(queue5.poll());
		queue5.offer(queue5.poll());
		
		while(true) {
			System.out.println("**********************************");
			
			System.out.print("Cashier 1 is serving: ");
			stack1.push(queue1.poll());
			stack1.push(queue1.poll());
			stack1.push(queue1.poll());
			stack1.push(queue1.poll());
			stack1.pop();
			System.out.println(stack1);
			
			System.out.print("Cashier 2 is serving: ");
			stack2.push(queue2.poll());
			stack2.push(queue2.poll());
			stack2.push(queue2.poll());
			stack2.push(queue2.poll());
			System.out.println(stack2);
			
			
			System.out.print("Cashier 3 is serving: ");
			stack3.push(queue3.poll());
			stack3.push(queue3.poll());
			stack3.push(queue3.poll());
			stack3.push(queue3.poll());
		
			System.out.println(stack3);
		
			System.out.print("Cashier 4 is serving: ");
			stack4.push(queue4.poll());
			stack4.push(queue4.poll());
			stack4.push(queue4.poll());
			stack4.push(queue4.poll());
			System.out.println(stack4);
		
			System.out.print("Cashier 5 is serving: ");
			stack5.push(queue5.poll());
			stack5.push(queue5.poll());
			stack5.push(queue5.poll());
			stack5.push(queue5.poll());
			System.out.println(stack5);
			System.out.println("**********************************");
			
			break;
		}
		System.out.println("Cashier Processing: ");
		for(int i = 1 ; i <= 4 ; i++) {
			if(stack1.size() == 4) {
				stack1.pop();
				System.out.println("Cashier 1 is serving: " + stack1);
			}
			if(stack2.size() == 4) {
				stack2.pop();
				System.out.println("Cashier 2 is serving: " + stack2);
			}
			if(stack3.size() == 4) {
				stack3.pop();
				System.out.println("Cashier 3 is serving: " + stack3);
			}
			if(stack4.size() == 4) {
				stack4.pop();
				System.out.println("Cashier 4 is serving: " + stack4);
			}
			if(stack5.size() == 4) {
				stack5.pop();
				System.out.println("Cashier 5 is serving: " + stack5);
			}
			System.out.println("**********************************");
		}
	}
	
	
}