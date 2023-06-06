import java.util.Scanner;

class BasicData
{
	Scanner sc = new Scanner(System.in);
	String name,address,mailid;
	int id;
	long mobileno;
	void getData()
	{
		System.out.println("Enter Employee Name > > > ");
		name=sc.next();
		System.out.println("Enter Employee ID > > > ");
		id=sc.nextInt();
		System.out.println("Enter Employee Address > > > ");
		address=sc.next();
		System.out.println("Enter Employee Mobile No. > > > ");
		mobileno=sc.nextLong();
		System.out.println("Enter Employee Mail ID > > > ");
		mailid=sc.next();
	}
	void displayData()
	{
		System.out.println("Employee Name > "+name);
		System.out.println("Employee ID > "+id);
		System.out.println("Employee Address > "+address);
		System.out.println("Employee Mobile No. > "+mobileno);
		System.out.println("Employee mail ID > "+mailid);
	}
}

class Programmer extends BasicData
{
	float salary;
	void Display()
	{
		System.out.println("Enter Salary of Programmer (BP) > > > "+salary);
		salary=sc.nextFloat();
		System.out.println("Dearness Allowance (DA) > > > " + 0.97*salary);
		System.out.println("House Rent Allowance (HRA)" + 0.1*salary);
		System.out.println("Provident Fund (PF) > > > " + 0.12*salary);
		System.out.println("Staff Club Fund () > > > " + 0.001*salary);
	}
}

class AssistantProfessor extends BasicData
{
	float salary;
	void Display()
	{
		System.out.println("Enter Salary of Assistant Professor (BP) > > > "+salary);
		salary=sc.nextFloat();
		System.out.println("Dearness Allowance (DA) > > > " + 0.97*salary);
		System.out.println("House Rent Allowance (HRA)" + 0.1*salary);
		System.out.println("Provident Fund (PF) > > > " + 0.12*salary);
		System.out.println("Staff Club Fund () > > > " + 0.001*salary);
	}
}

class AssociateProfessor extends BasicData
{
	float salary;
	void Display()
	{
		System.out.println("Enter Salary of Associate Professor (BP) > > > "+salary);
		salary=sc.nextFloat();
		System.out.println("Dearness Allowance (DA) > > > " + 0.97*salary);
		System.out.println("House Rent Allowance (HRA)" + 0.1*salary);
		System.out.println("Provident Fund (PF) > > > " + 0.12*salary);
		System.out.println("Staff Club Fund () > > > " + 0.001*salary);
	}
}
class Professor extends BasicData
{
	float salary;
	void Display()
	{
		System.out.println("Enter Salary of Professor (BP) > > > "+salary);
		salary=sc.nextFloat();
		System.out.println("Dearness Allowance (DA) > > > " + 0.97*salary);
		System.out.println("House Rent Allowance (HRA)" + 0.1*salary);
		System.out.println("Provident Fund (PF) > > > " + 0.12*salary);
		System.out.println("Staff Club Fund () > > > " + 0.001*salary);
	}
}

public class Employee
{
	public static void main(String[] args)
	{
		Programmer p1 = new Programmer();
		AssistantProfessor p2 = new AssistantProfessor();
		AssociateProfessor p3 = new AssociateProfessor();
		Professor p4 = new Professor();
		Scanner sc = new Scanner(System.in);
		int ch;
		do
		{
			System.out.println("\n1.Programmer \n2.Assistant Professor \n3.Associative Professor \n4.Professor \n5.Exit");
			System.out.println("Enter The Choise To Get Employee Data > > > ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:
					p1.getData();
					p1.Display();
					p1.displayData();
					break;
				case 2:
					p2.getData();
					p2.Display();
					p2.displayData();
					break;
				case 3:
					p3.getData();
					p3.Display();
					p3.displayData();
					break;
				case 4:
					p4.getData();
					p4.Display();
					p4.displayData();
					break;
			}
		}while(ch>0 && ch<5);
	}
}
