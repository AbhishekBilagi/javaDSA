import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Details {
	public static void main(String[] args) throws IllegalArgumentException {
		
		ArrayList<Problem29> l=new ArrayList<Problem29>();
		String firstname="AbhisheK";
		String lastname="Bilagi";
		String contryCode="+91";
		String phNo="8904267527";
		IndianPhoneNumber p=new IndianPhoneNumber(phNo);
		String email="abhi1998@gmail.com";
		String password="abhishek12";
		String dob="12-03-2000";
		Date date = new Date();
		Problem29 user=new Problem29(firstname,lastname,email,password,date,p);
		
	    try {
		validation(user);
	    }
	    catch(Exception e){
	    	System.out.println(e);
	    }
			
		
	}
	public static void validation(Problem29 user ) throws IllegalArgumentException{
		//checking first name and last name
		
		
		if(user.getFirstname().matches("[a-zA-Z]+") ) {
			System.out.println("First name  contains alphabet");
		}
		else {
			throw new IllegalArgumentException("First name  not contains alphabet");
		}
		if(user.getFirstname().matches("[a-zA-Z]+")){
			System.out.println("last name contains alphabet");
		}
		else {
			throw new IllegalArgumentException("last name not contains alphabet");
		}
		
		// chaecking password
		boolean flag=true;
		if((user.getPassword().length()>=8 && user.getPassword().length()<=16)) {
			for(int i=0;i<user.getPassword().length();i++) {
				if(user.getPassword().charAt(i)>='0' && user.getPassword().charAt(i)<='9' ) {
					flag=false;
				}
			}
		}
		if(flag) {
			throw new IllegalArgumentException("Password Should contain 8-16 characters and atleast 1 digit");
		}
		
		//checking email
		boolean b=true;
		for(int i=0;i<user.getEmail().length();i++) {
		if(user.getEmail().charAt(i)=='@' && user.getEmail().charAt(i)=='.' && user.getEmail().charAt(i)!=' ' ){
			b=false;
		}
		}
		if(b) {
			throw new IllegalArgumentException("Email should contain an (.) and an (@) and should not have any spaces in between");
		}
	}
	

}
