package returnPractice;

public class Student {
	
	private  String name;
	private  int age;
	
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
	public  Student(String name, int age)
	{
		this.name = name;
		this.age =age;
		//System.out.println(" Student name : "+name +" & age : "+age);
	}
	
	
	Student updateStudent(String s, int a)
	{
		Student st = new Student(s,a);
		this.name = s;
		this.age = a;
		return st;
		
	}
	
	void display()
	{
		Student st = new Student(name,age);
		System.out.println("Student Name : " + st.name +"  " + " & age : " + st.age);
	}
	
	public static void main(String[] args) {
		Student str = new Student("shaan", 45);
		str.display();
	//
		Student s = str.updateStudent("naz", 35);
		//System.out.println("Student Name : " + s.name +"  " + " & age : " + s.age);
		str.display();
	}


	
	

}
