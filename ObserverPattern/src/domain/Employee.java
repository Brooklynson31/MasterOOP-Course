package domain;

import java.util.Date;

public class Employee {

	private String name;
	private Date hireDate; 

	boolean working = false;
	private int salary;
	private int employeeID;
	
	private static int COUNTER;
	
	public Employee(String name, Date hireDate, boolean working, int salary) {
		
		this.name = name;
		this.hireDate = hireDate;
		this.working = working;
		this.salary = salary;
		
		employeeID = ++COUNTER;
	}

	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public Integer getId(){
		return this.employeeID;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", hireDate=" + hireDate + ", working=" + working + ", salary=" + salary
				+ ", employeeID=" + employeeID + "]";
	}


}
