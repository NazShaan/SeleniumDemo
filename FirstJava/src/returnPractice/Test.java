package returnPractice;

public class Test
{
	
	
	public static void main(String[] args) {

		//Student st = new Student("Shaan", 45);
		//System.out.println(" Student name : "+st.getName() +" & age : "+st.getAge());
		Test t = new Test();
		System.out.println(t.getStudent("shaan", 25));
		Student obj =t.getStudent("Shaan", 45);
		System.out.println(obj);
	}
	
	public  Student getStudent(String n, int ag)
	{
	
		Student st = new Student(n,ag);
		n = st.getName();
		ag = st.getAge();
		
		
		return st;
		
	}

}
