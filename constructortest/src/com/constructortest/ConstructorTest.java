package com.constructortest;

class Employee{
	public String getEmployeename() {
		return Employeename;
	}
	public void setEmployeename(String employeename) {
		Employeename = employeename;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	private String Employeename;
	private int empid;
	Employee(){
	
		System.out.println("I am a Default Constructor");
		Employeename = "Marun";
		empid = 1001;
	}
	
	Employee(String name , int id){ // parameter Constructor
		Employeename = name;
		empid = id ;
		
		
	}
	
		void Employeeinfo() { //Method
		System.out.println("employee Name"+Employeename);
		System.out.println("employee Id"+empid);
		
		
		
		
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
	Employee e1 = new Employee("Marun",1001); //calling Constructor
  e1.Employeeinfo();
  
		// TODO Auto-generated method stub

	}

}
