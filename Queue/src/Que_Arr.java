
public class Que_Arr {
	private int rear;
	static class Queue{
		private int[] arr;
		private int size;
		private int rear=-1;
		
		Queue(int size){
			arr=new int[size];
			this.size=size;
		}
		
		public boolean isEmpty() {
			return rear==-1;
		}
		//enque
		public void add(int data) {
			
			if(rear==size-1) {
				System.out.println("Queue is full");
			}
			rear++;
			arr[rear]=data;
			
		}
		
		//deque--0(n)
		public int deque() {
			
			if(isEmpty()) {
				System.out.println("queue is empty");
				return -1;
			}
			int front=arr[0];
			for(int i=0;i<rear;i++) {
				arr[i]=arr[i+1];
			}
			rear--;
			return front;
		}
		
		//peek
		public int peek() {
			if(isEmpty()) {
				System.out.println("queue is empty");
				return -1;
			}
			int front=arr[0];
			return front;
		}
	}
	
	public static void main(String[] args) {
		
		Queue q=new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.deque();
		}
		
		
	}
}
