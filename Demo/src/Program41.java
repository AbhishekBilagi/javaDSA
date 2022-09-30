
class Thread1 extends Thread{
	@Override
	public void run() {
		
		Program41 even=new Program41();
		even.evenNumber();
		
			
		}
		
	}


class Thread2 implements Runnable{
	@Override
	public void run() {
		
		Program41 odd=new Program41();
		odd.oddNumber();
		
	}
}
public class Program41 {
	static int limit=100;
	
	public static void main(String[] args) {
		
		Thread1 t1=new Thread1();
		t1.start();
		
		Thread2 r=new Thread2();
		Thread t2=new Thread(r);
		t2.start();
		
	}
	synchronized void evenNumber() {
		for(int i=0;i<limit;i++) {
			if(i%2==0) {
				System.out.println("Even "+i);
			}
		}
	}
	synchronized void oddNumber() {
		for(int i=0;i<limit;i++) {
			if(i%2!=0) {
				System.out.println("Odd "+i);
			}
		}
	}

}
