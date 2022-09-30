import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Height {
	int feet;
	int inches;
	public Height(int feet, int inches) {
	
		this.feet = feet;
		this.inches = inches;
	}
	@Override
	public String toString() {
		return "Height [feet=" + feet + ", inches=" + inches + "]";
	}
	
	
}

abstract class Student{
	String name;
	Height height;
	String branch;
	//abstract int compareByHeight (Student s1, Student s2);
	
}
 class EEEStudent extends Student implements Comparator<EEEStudent> {
     
	 EEEStudent(){
		 
	 }
	 EEEStudent(String name,Height height,String branch){
		 super.name=name;
		 super.height=height;
		 super.branch=branch;
	 }
	 
	@Override
	public String toString() {
		return "EEEStudent [name=" + name + ", height=" + height + ", branch=" + branch + "]";
	}
	@Override
	
		
		public int compare(EEEStudent o1, EEEStudent o2) {
			
			return o2.height.feet-o1.height.feet;
		}
		
    }
 
 class ECEStudent extends Student implements Comparator<ECEStudent>{
	 ECEStudent(){
		 
	 }
	 ECEStudent(String name,Height height,String branch){
		 super.name=name;
		 super.height=height;
		 super.branch=branch;
	 }
	 
	 
	@Override
	public String toString() {
		return "ECEStudent [name=" + name + ", height=" + height + ", branch=" + branch + "]";
	}
	@Override
	public int compare(ECEStudent o1, ECEStudent o2) {
		
		return o2.height.feet-o1.height.feet;
	}
	 
 }
 
 class CSEStudent extends Student implements Comparator<CSEStudent>{
	 CSEStudent(){
		 
	 }
	 CSEStudent(String name,Height height,String branch){
		 super.name=name;
		 super.height=height;
		 super.branch=branch;
	 }
	 
	@Override
	public String toString() {
		return "CSEStudent [name=" + name + ", height=" + height + ", branch=" + branch + "]";
	}
	@Override
	public int compare(CSEStudent o1, CSEStudent o2) {
		
		return o2.height.feet-o1.height.feet;
	}
	 
 }



public class StudentMain {
	
	public static void main(String[] args) {
		ArrayList<Student> s=new ArrayList<>();
		s.add(new EEEStudent("Abhishek",new Height(4, 2),"EEE"));
		s.add(new CSEStudent("Varun",new Height(5, 2),"CSE"));
		s.add(new ECEStudent("Santosh",new Height(3, 6),"ECE"));
		s.add(new EEEStudent("Vishal",new Height(2, 4),"EEE"));
		s.add(new CSEStudent("Dinga",new Height(4, 2),"CSE"));
		s.add(new ECEStudent("Dingi",new Height(5, 6),"ECE"));
		
		ArrayList<CSEStudent> cse=new ArrayList<>();
		ArrayList<EEEStudent> eee=new ArrayList<>();
		ArrayList<ECEStudent> ece=new ArrayList<>();
		
		//cse=s.stream().filter(e->e.branch.equals("CSE")).toList();
		for(int i=0;i<s.size();i++) {
			
		
			Student s1= s.get(i);
			if(s1.branch.equals("CSE")) {
				cse.add( (CSEStudent) s1);
			}
		}
		for(int i=0;i<s.size();i++) {
			Student s2= s.get(i);
			if(s2.branch.equals("EEE")) {
				eee.add((EEEStudent) s2);
			}
		}
		for(int i=0;i<s.size();i++) {
			Student s3= s.get(i);
			if(s3.branch.equals("ECE")) {
				ece.add( (ECEStudent)s3);
			}
		}
		
		Collections.sort(cse,new CSEStudent());
		Collections.sort(eee,new EEEStudent());
		Collections.sort(ece,new ECEStudent());
		
		new Thread(){
			public void run() {
				try {
					StudentMain student=new StudentMain();
					student.printCSE(cse);
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
          }
		}.start();
		System.out.println("-----------------------------------------------------------------------");
		new Thread(){
			public void run() {
				try {
					StudentMain student=new StudentMain();
					student.printECE(ece);
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
          }
		}.start();
		System.out.println("-----------------------------------------------------------------------");
		new Thread(){
			public void run() {
				try {
					StudentMain student=new StudentMain();
					student.printEEE(eee);
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
          }
		}.start();
		System.out.println("-----------------------------------------------------------------------");
	}
	
	
	public synchronized  void printCSE(List<CSEStudent> cse) throws InterruptedException {
		int i=0;
		boolean flag=false;
		while(i<cse.size()) {
			while(flag) {
				wait();
			}
			flag=true;
			System.out.println(cse.get(i++));
			flag=false;
			notifyAll();
		}
	}
	public synchronized  void printECE(List<ECEStudent> ece) throws InterruptedException {
		int i=0;
		boolean flag=false;
		while(i<ece.size()) {
			while(flag) {
				wait();
			}
			flag=true;
			System.out.println(ece.get(i++));
			flag=false;
			notifyAll();
		}
	}
	public synchronized  void printEEE(List<EEEStudent> eee) throws InterruptedException {
		int i=0;
		boolean flag=false;
		while(i<eee.size()) {
			while(flag) {
				wait();
			}
			flag=true;
			System.out.println(eee.get(i++));
			flag=false;
			notifyAll();
		}
	}
}
