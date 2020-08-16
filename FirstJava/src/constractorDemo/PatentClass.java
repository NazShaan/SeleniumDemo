package constractorDemo;

public class PatentClass {
	
	String name;
	int phn;
	float sal;
	
	public PatentClass() 
	{
			System.out.println("this is no args constractor form pc");
		}
	
	PatentClass(String name)
	{
		this();
		this.name = name;
		System.out.println(this.name);
	}
	
	public PatentClass(String name, int phn) 
	{
		this("shaan");
		this.name = name;
		this.phn = phn;
		System.out.println(name+"--------------"+phn);
		
	}




public PatentClass(String name, int phn, float sal) 

{
	this("shaan",1234);
	this.name = name;
	this.phn = phn;
	this.sal = sal;
	System.out.println(this.name +"------"+this.phn+"--------"+ this.sal);
}

public static void main(String[] args) {
	
	PatentClass pc3 = new PatentClass("shaan", 347748, 4005.5f);
	
	
	
}



	
}

