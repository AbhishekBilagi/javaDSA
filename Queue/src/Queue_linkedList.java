
public class Queue_linkedList {
	
	static class Node{
		private int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	static class Queue{
	
		Node head=null;
		Node tail=null;
	
		
	public boolean isEmpty() {
		return head==null && tail==null;
	}
	//enque
	public void add(int data) {
		
	  Node newNode=new Node(data);
	  if( tail==null) {
		  tail=head=newNode;
		  return;
	  }
	  tail.next=newNode;
	  tail=newNode;
	}
	
	//deque--0(n)
	public int deque() {
		
		int front=head.data;
		if(tail==head) {
			tail=null;
		}
		head=head.next;
		
		return front;
	}
	
	//peek
	public int peek() {
		
		if(head==null) {
			System.out.println("Queue is empty");
			return -1;
		}
		int front =head.data;
		return front;
	
	  }
	}

	public static void main(String[] args) {
		
		Queue q=new Queue();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.deque();
		}
		
	 }
	
}
