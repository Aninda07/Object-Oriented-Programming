class students 
{
	private String name;
	private int id;
	private String department;
    private String dateofbirth;

public void students(String n,int i,String d,String db)
{
	name = n;
	id = i;
	department = d;
	dateofbirth = db;
}
public void show()
{
	System.out.println("Name :"+n);
	System.out.println("ID :"+i);
	System.out.println("Department :"+d);
	System.out.println("Date of Birth :"+db);
} 

	
}

class undergraduate extends students {
	private double gradeSSC;
	private double gradeHSC;
	private double currentCGPA;
	
	public void undergraduate(String n,int i,String d,String db,double sd,double hd,double cg)
	{
		super(n,i,d,db);
		gradeSSC = sd;
		gradeHSC = hd;
		current CGPA = cg;
	}
	
	public void calculate(int n)
	{
		int tutionfee = n*6000;
		return tutionfee;
	}
	public void show()
	{
		super.show();
		System.out.println("SSC Grade :"+sd);
	System.out.println("HSC Grade :"+hd);
	System.out.println("Current CGPA :"+cg);

	}	
	
}

class graduate extends students 
{
	private double CGPAinUG;
	private String supervisor;
	
	public void graduate(String n,int i,String d,String db,double ccg,String na)
	{
		super(n,i,d,db);
		CGPAinUG = ccg;
		supervisor = a;
	}
	
	public int calculate(int n)
	{
		int tutionfee = (n*6000)+5000;
		return tutionfee;
		
	}
	public void show()
	{
		super.show();
		System.out.println("Undergraduate CGPA :"+ccg);
	System.out.println("Supervisor Name :"+a);

	}
	
}


class main 
{ 
public static void main(String []args){
	
	
	students s1 = new students();
	s1.students("Anik SH",1222,"Computer Enguineering","17 January 1998");
	s1.show();
	
	undergratuate s2 = new undergraduate();
	s2.undergraduate("Amit SH",1272,"Computer Enguineering","17 January 1998",4.50,4.00,3.35);
	s2.calcualte(123);
	s2.show();
	
	graduate s3 = new graduate();
	s3.graduate("Anik SH",1282,"Computer Enguineering","17 January 1998",3.50,"Zishan Mahbub");
	s3.calculate(110);
	s3.show();
}

}