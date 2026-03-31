package default_package;

import java.util.Stack;

public class SortStack {
	static Stack<Integer> s ;
	static void Insert(int x) {
		if(s.isEmpty() || s.peek() <= x) {
			s.push(x);
			return;
		}
		int top = s.pop();
		Insert(x);
		s.push(top);
	}
	static void sortStack() {
		if(s.empty()) {
			return;
		}
		int top = s.pop();
		sortStack();
		Insert(top);
	}
	public static void main(String[] args) {
		s = new Stack<>();
		s.push(45);
		s.push(5);
		s.push(49);
		s.push(67);
		s.push(12);
		sortStack();
		System.out.println("Sorted Stack " + s);
		
		
		
	}

}
