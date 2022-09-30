import java.util.Date;

class PhoneNumber {
    String countryCode;
    String phNo;

    PhoneNumber(String countryCode, String phNo) {
        this.countryCode = countryCode;
        this.phNo = phNo;
    }

    @Override
    public String toString() {
        return countryCode + "-" + phNo;
    }
} 
class IndianPhoneNumber extends PhoneNumber {
    IndianPhoneNumber(String phNo) {
        super("+91", phNo);
    }

}
public class Problem29{
 private String email;
 private String password;
 private String firstname;
 private String lastname;
 private Date dateOfBirth;
 IndianPhoneNumber phoneNumber;
public Problem29(String firstname, String lastname, String email, String password, 
		Date dateOfBirth, IndianPhoneNumber phoneNumber) {
	
	this.email = email;
	this.password = password;
	this.firstname = firstname;
	this.lastname = lastname;
	this.dateOfBirth = dateOfBirth;
	this.phoneNumber = phoneNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public IndianPhoneNumber getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(IndianPhoneNumber phoneNumber) {
	this.phoneNumber = phoneNumber;
}
 
}
