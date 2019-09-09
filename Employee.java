public class Employee{
	String first_name, last_name;
	String job;
	int salary;
	
	public Employee(String first_name,String last_name,String job,int salary){
		this.first_name=first_name;
		this.last_name=last_name;
		this.job=job;
		this.salary=salary;
	}
	public int getSalary(){
		return salary;
	}
	public String toString(){
		return "Fisrt_Name: " + first_name 
		+ "Last_Name: " + last_name
		+ "Job: " + job
		+ "Salary : " + salary;
	}
}