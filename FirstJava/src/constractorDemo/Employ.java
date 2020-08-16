package constractorDemo;

public class Employ {
	
	private int empNo;
	private String empName;
	
	Employ(int empNo, String empName)
	{
		super();
		this.empNo = empNo;
		this.empName = empName;
		
	}
	
								public int getEmpNo() {
									return empNo;
								}
							
													
								public String getEmpName() {
									return empName;
								}
	
	void diplay()
	{
		System.out.println("EmployeeID : "+ empNo +"  EmployeeName : "+ empName);
	}
	
					
	public static void main(String[] args) 
	{
		Employ e = new Employ(101, "Shaan");
		e.diplay();
	}

}
