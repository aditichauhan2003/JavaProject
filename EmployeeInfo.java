package com.employeemanagementapplication;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class EmployeeInfo {
HashSet<Employee> empset=new HashSet<Employee>();
	
	Employee emp1=new Employee(001, "Mitali", 27, "DevOps Eng", "Admin", 580000);
	Employee emp2=new Employee(002, "Rishabh", 29, "System Eng","CO", 400000);
	Employee emp3=new Employee(003, "Priya", 24, "Developer","IT", 600000);
	Employee emp4=new Employee(004, "Rohit", 25, "Tester","CO",  550000);
	
	Scanner sc=new Scanner(System.in);
	boolean found=false;
	int id;
	String name;
	int age;
	String department;
	String designation;
	double sal;
	
	public EmployeeInfo() {
		
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		
	}
	
	//view all employees
	public void viewAllEmps() {
		for(Employee emp:empset) {
			System.out.println(emp);
		}
	}
	//view employee based on there id
	public void viewEmp(){
		
		System.out.println("Enter id: ");
		id=sc.nextInt();
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println(emp);
				found=true;
			}
			
		}
		if(!found) {
			System.out.println("Employee with this id is not present");
		}
	}
	//update employee
	public void updateEmployee() {
		System.out.println("Enter id: ");
		id=sc.nextInt();
		boolean found=false;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				System.out.println("Enter name: ");
				name=sc.next();
				System.out.println("Enter new Salary");
				sal=sc.nextDouble();
				emp.setName(name);
				emp.setSalary(sal);
				System.out.println("Updated Details of employee are: ");
				System.out.println(emp);
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			System.out.println("Employee details updated successfully !!");
		}
	}
	//delete employee
	public void deleteEmp() {
		System.out.println("Enter id");
		id=sc.nextInt();
		boolean found=false;
		Employee empdelete=null;
		for(Employee emp:empset) {
			if(emp.getId()==id) {
				empdelete=emp;
				found=true;
			}
		}
		if(!found) {
			System.out.println("Employee is not present");
		}
		else {
			empset.remove(empdelete);
			System.out.println("Employee deleted successfully!!");
		}
	}
	//add employee
	public void addEmp() {
		System.out.println("Enter id:");
		id=sc.nextInt();
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("enter Desiganation");
		designation=sc.next();
		System.out.println("Enter Department");
		department=sc.next();
		System.out.println("Enter sal");
		sc.nextDouble();
		
		Employee emp=new Employee(id, name, age, designation, department, sal);
		
		empset.add(emp);
		System.out.println(emp);
		System.out.println("Employtee addeed successsfully");
		
	}


}
