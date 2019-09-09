import java.util.Scanner;
public class EmployeeMain{
	public static void main(String[] args){
		System.out.println("Hello Pse");
		System.out.println("--------------");
		System.out.println("What is the first name?");
		Scanner sc = new Scanner(System.in);
		String fisrt_name =sc.nextLine();
		System.out.println("First Name is: " + fisrt_name);
		System.out.println("What is the last name?");
		String last_name =sc.nextLine();
		System.out.println("Last Name is: " + last_name);
		System.out.println("Employee Full Name is: " +fisrt_name +" " + last_name);
		System.out.println("------------");
		String job =sc.nextLine();
		System.out.println("Employee job is: " + job);
		System.out.println("------------");
		int salary =sc.nextInt();
		System.out.println("Employee salary is: " + salary);
		System.out.println("------------"); 
		Employee em = new Employee(fisrt_name,last_name,job,salary);
		em.getSalary();
	}
}