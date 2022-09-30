package queue;

public class MyMain {
  public static void main(String[] args) {
	MyQueue queue=new MyQueue() ;
		queue.enqueue(1000);
		queue.enqueue(300);
		queue.enqueue(400);
		queue.enqueue(500);
		queue.enqueue(600);
		queue.enqueue(700);
		System.out.println(queue.size());
		System.out.println(queue.dequeue().getData());
		System.out.println("the size queue is after deleting "+queue.size());
	    System.out.println(queue.peek());
}
}
