import java.util.ArrayList;
import java.util.Scanner;
public class MainEmpl{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> emp = new ArrayList<Employee>();
	for(int i=0;i<3;i++){
		emp.add(readEmployee(sc));
		System.out.println(emp.get(i));
	}
	}
	public static Employee readEmployee(Scanner sc){
		String firstName = readString(sc, "First name: ");
		String lastName = readString(sc, "Last name: ");
		String job = readString(sc, "Job: ");
		int salary =readInt(sc,0);
		
		return new Employee(firstName, lastName, job,salary);
		}
	public static String readString(Scanner sc,String msg){
		System.out.println(msg);
		return sc.nextLine();
	}
	public static int readInt(Scanner sc,int numbers){
		System.out.println(numbers);
		return sc.nextInt();
	}
}