import java.util.*;
class Employee
{
	void display()
	{
	System.out.println("Name of class is Employee");
	}
	void calcSalary()
	{
	System.out.println("Salary of employee is 10000");
	}
}
class Engineer extends Employee
{
	void calcSalary()
	{
	System.out.println("Salary of employee is 20000");
	super.calcSalary();
	}
}
class Test3
{
	public static void main(String args[])
	{
	Engineer obj=new Engineer();
	obj.display();
	obj.calcSalary();
	}
}
