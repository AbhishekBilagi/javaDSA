import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {
  public static void main(String[] args) {
	
	  ArrayList<Employee> e=new ArrayList<>();
	  e.add(new Employee(3, "Vishal Singhal", 34, "male", "HR", 2013, 300000));
	  e.add(new Employee(4, "Amitabh Singh", 35, "male", "Admin", 2014, 500000));
	  e.add(new Employee(5, "Vivek Bhati", 28, "male", "Admin", 2017, 500000));
	  e.add(new Employee(6, "Vipul Diwan", 34, "male", "Account", 2014, 200000));
	  e.add(new Employee(7, "Satish Kumar", 29, "male", "Account", 2017, 75000));
	  e.add(new Employee(8, "Geetika Chauhan", 30, "female", "Admin", 2016, 90000));
	  int hr=0,admin=0,account=0;
	  
	  for(int i=0;i<e.size();i++) {
		  Employee emp=e.get(i);
		  if(emp.department.equals("HR")) {
			  hr++;
		  }
		  if(emp.department.equals("Admin")){
			  admin++;
		  }
		  if(emp.department.equals("Account")) {
			 account++; 
		  }
	  }
	  System.out.println("HR: "+hr+" Admin: "+admin+" Account: "+account);
	
	  
	  Map<String, Double> averageSalary = e.stream()
              .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
      System.out.println(averageSalary);
      Optional<Employee> highestPaid = e.stream().max(Comparator.comparingDouble(Employee::getSalary));
      System.out.println(highestPaid);

      Map<String, Double> averageAge = e.stream()
              .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getAge)));
      System.out.println(averageAge);

      Optional<Employee> mostExperienced = e.stream()
              .min(Comparator.comparingInt(Employee::getYearOfJoining));
      System.out.println(mostExperienced);

      Optional<Employee> youngest = e.stream()
              .min(Comparator.comparingInt(Employee::getAge));
      System.out.println(youngest);
      Map<String, Long> count = e.stream()
              .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
      System.out.println(count);

      Map<String, Long> genderCount = e.stream()
              .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
      System.out.println(genderCount);

  }

  
  
}
