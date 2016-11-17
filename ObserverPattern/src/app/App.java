package app;

import java.util.Date;

import domain.Employee;
import observer.HRDepartment;
import observer.IObserver;
import observer.PayrollDepartment;
import subjects.EmployeeManagementSystem;

public class App {

	public static void main(String[] args) {
		
		IObserver payroll = new PayrollDepartment();
		IObserver hrSystem = new HRDepartment();
		
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		
		ems.registerObserver(payroll);
		ems.registerObserver(hrSystem);
		
		Employee bob = new Employee("Bob", new Date(), true,35000);	
		
		ems.hireNewEmployee(bob);

		
	}

}
