package StackDemo;
import java.io.*;
import java.util.*;



// This Example is the Pass by Reference Example
class Stack_Methods {
	Stack<Integer> st = new Stack<Integer>();
	
	

	public void push_stack(int n) {
		for (int i = 1; i <= n; i++) {
			this.st.push(i);
		}
	}

	
	public void pop_stack() {
		
		while (!this.st.empty()) {
			System.out.println(st.pop());
		}
	}

	public void peek_stack() {
		int temp = this.st.peek();
		System.out.println(temp);
	}

	public void search_stack(int element) {
		int temp = this.st.search(element);
		System.out.println(temp);
	}

}

public class StackInJava {
	public void stack_push(Stack<Integer> stack) {
		for (int i = 0; i < 5; i++) {
			stack.push(i);
		}
	}

	public void stack_pop(Stack<Integer> stack) {
		System.out.println("Pop Operation:");

		for (int i = 0; i < 5; i++) {
			Integer y = (Integer) stack.pop();
			System.out.println(y);
		}
	}
	
	public void stack_peek(Stack<Integer> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }

	public static void main(String[] args) {
//		Stack_Methods pointer = new Stack_Methods();
//		pointer.push_stack(5);
		//pointer.pop_stack();
		//pointer.peek_stack();
//		pointer.search_stack(2);
//		pointer.search_stack(1);
		

		//                         This stack is also a pass by reference
		
		
		Stack<Integer> st1 = new Stack<Integer>();
		
		
		StackInJava pointer = new StackInJava();
		pointer.stack_push(st1);
		//pointer.stack_pop(st1);
		
		System.out.println(st1);
		
//		
		pointer.stack_peek(st1);
////		//st1.pop();
////		pointer.stack_peek(st1);
////		
//		Stack<Integer> st2 = st1;
////		pointer.stack_peek(st2);
////		System.out.println(st2.size());
//		pointer.stack_pop(st2);
//		pointer.stack_peek(st1);
		
		
		//                                    Iterate Stack                                     ///
		
		Iterator it = st1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		pointer.stack_peek(st1);
		

	}

}
