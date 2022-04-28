package com.iq.oops.encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
	/**	Employee employee=new Employee();
		employee.setEid(1);
		employee.setEname("Rohit");
	    int a=	employee.getEid();
		System.out.println(employee.getEid());
		System.out.println(a);
		*/
		
	/**	Employee employee=new Employee(1, "Rohit");
		System.out.println(employee.getEid());
		System.out.println(employee.getEname());
		*/
		
		Employee employee=new Employee(1, "Rohit");
		employee.setEid(2);
		employee.setEid(3);
		employee.setEid(4);
		System.out.println(employee.getEid());
		System.out.println(employee.getEname());
		System.out.println(employee.getEid());
		
		Employee employee1=new Employee(6, "Rohit");
		employee.setEid(5);
		System.out.println(employee.getEid());
		System.out.println(employee1.getEid());
		
	}
}
