package design;

import java.util.Scanner;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name :");
		String employeeName = sc.next();

		System.out.println("Enter Employee ID :");
		int employeeID = sc.nextInt();

//		System.out.println("Enter Employee's joining date :");
//		String joining = sc.next();
//
//		System.out.println("Enter Employee Position :");
//		String employeePosition = sc.next();
//
//		System.out.println("Activity : BEST, GOOD, or AVERAGE");
//		String activity = sc.next();
//
//		System.out.println("Enter Employee's Yearly Salary :");
//		int salary = sc.nextInt();

		EmployeeInfo employee = new EmployeeInfo(employeeName,employeeID);

		String name = employee.name;
		int employeeId = employee.employeeId;

		System.out.println(name+" "+employeeId);

	}

}
