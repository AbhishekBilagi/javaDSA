

public class LL {
	Node head;
	private int size;
	
	public LL() {
		this.size=0;
	}
	
	class Node
	{
	
		String data;
		Node next;
		public Node(String data) {
			this.data=data;
			this.next=null;
			size++;
		}
	}

	//add first
	  public void addFirst(String data) {
		  Node newNode=new Node(data);
		  if(head==null) {
			  head=newNode;
			  return;
		  }
		  newNode.next=head;
		  head=newNode;
		  
	}
	// addLast
	  public void addLast(String data) {
		  Node newNode=new Node(data);
		  if(head==null) {
			  head=newNode;
			  return;
		  }
		  
		  Node currNode=head;
		  while(currNode.next!=null) {
			  currNode=currNode.next;
		  }
		  currNode.next=newNode;
	
	  }
	   
	  //print data
	  public void printData() {
		  
		 
		  if(head==null) {
			 System.out.println("Linked list empty");
			  return;
		  }
		  Node currNode=head;
		  while(currNode!=null) {
			  System.out.print(currNode.data+"--->");
			  currNode=currNode.next;
		  }
		  System.out.println("Null");
	  }
	  //delete first
	  public void deleteFirst() {
		  if(head==null) {
			  System.out.println("list is empty");
			  return;
		  }
		  size--;
		  head=head.next;
		 
		  
		
	  }
	  //delete last
	  public void deleteLast() {
		  if(head==null) {
			  System.out.println("list is empty");
			  return;
		  }
		 
		  if(head.next==null) {
			  head=null;
			  return;
		  }
		 Node secondLast=head;
		 Node lastNode=head.next;
		 while(lastNode.next!=null) {
			 lastNode=lastNode.next;
			 secondLast=secondLast.next;
		 }
		 secondLast.next=null;
		 size--;
	  }
	  
	  public int getSize() {
		  return size;
	  }
  public static void main(String[] args) {
    LL list =new LL();
    list.addFirst("is");
    list.addFirst("a");
    list.printData();
    list.addLast("demo");
    list.printData();
    list.deleteLast();
    list.printData();
    System.out.println(list.getSize());
    list.addLast("test");
    System.out.println(list.getSize());
  }

}
