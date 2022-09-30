import java.util.Scanner;

public class Problem28 {
	
	public static void main(String[] args) throws IllegalArgumentException {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		try {
			System.out.println(factorial(n));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static int factorial(int n) throws IllegalArgumentException 
	 {
	 if(n<0){
		 throw new IllegalArgumentException("foctorial is not possible for negative number");
		 
	 }
	 if(n>16) {
		 throw new IllegalArgumentException("value cannot be greater than 16");
	 }
	 int fac = 1;
	 for (int i=n; i>0; i--)
	 fac *= i;
	 return fac;
	 }
	

}
