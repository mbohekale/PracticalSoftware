public class Student{
	private String name;
	private String nationality;
	private int grade;
	public Student(String name,String nationality,int grade){
		this.name=name;
		this.nationality=nationality;
		this.grade=grade;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getNationality(){
		return nationality;
	}
	public void setNationality(String nationality){
		this.nationality=nationality;
	}
	public int getGrade(){
		return grade;
	}
	public String toString(){
		return "Name : "+name+" \n"
		+"Nationality : "+ nationality+" ,"
		+"Grade : "+ grade;
	}
}