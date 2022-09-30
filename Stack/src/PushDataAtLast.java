import java.util.Stack;

public class PushDataAtLast {

	public static void pushDataBottom(Stack<Integer> s,int data) {
		
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top=s.pop();
		pushDataBottom(s,data);
		s.push(top);
		
	}
	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		int data=4;
		s.push(1);
		s.push(2);
		s.push(3);
		
		pushDataBottom(s,data);
		
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}
}
