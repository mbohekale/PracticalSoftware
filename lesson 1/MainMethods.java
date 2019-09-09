import java.util.Scanner;
public class MainMethods{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the Message? ");
		String output=readString(sc,"");
		System.out.println(output);
		System.out.println("--------------");
		System.out.println("What is the numbers? ");
		int output2=readInt(sc,0);
		System.out.println(output2);
		String fisrt_name =sc.nextLine();
		String last_name =sc.nextLine();
		String job =sc.nextLine();
		int salary =sc.nextInt();
		Employee em = new Employee(fisrt_name,last_name,job,salary);
		
	}
	public static String readString(Scanner sc,String msg){
		System.out.println(msg);
		return sc.nextLine();
	}
	public static int readInt(Scanner sc,int numbers){
		System.out.println(numbers);
		return sc.nextInt();
	}
	public static Employee readEmployee(Scanner sc){
		
		String firstName = readString(sc, "First name: ");
		return new Employee("","","",0);
	}
	
	
}