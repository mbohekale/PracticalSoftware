import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class MainStudent{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	 String name 		= readString(sc, "Name: ");
	String nationality  = readString(sc, "Nationality: ");
	int grade = readInt(sc, "Grade: ");
	Student s = new Student(name, nationality,grade);
	System.out.println(s); 
	System.out.println("-----------------------------------");
	ArrayList<Student> students = new ArrayList<>();
		for(int i=0;i<3;i++){
			students.add(readStudent(sc));
		System.out.println(students.get(i));
		}
		System.out.println(Collections.max(students));
	
	}
	public static String readString(Scanner sc, String msg){
		System.out.println(msg);
		return sc.nextLine();
	}
	public static int readInt(Scanner sc, String msg){
		System.out.println(msg);
		int i = sc.nextInt();
		sc.nextLine();
		return i;
	}
	public static Student readStudent(Scanner sc){
		String name        = readString(sc, "Name:  ");
		String nationality = readString(sc, "Nationality:  ");
		int grade          = readInt(sc ,  "Grade:  ");
		return new Student(name,nationality,grade);
	}

}