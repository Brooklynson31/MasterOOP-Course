package dao;

import java.util.ArrayList;
import java.util.List;

import domain.Employee;

public class EmployeeDAO {
	
	Employee emp1 = new Employee("Mike", null, false, 32000);
	Employee emp2 = new Employee("Steve", null, false, 64000);
	Employee emp3 = new Employee("Susan", null, false, 50000);
	Employee emp4 = new Employee("Pat", null, false, 42000);
	Employee emp5 = new Employee("Joe", null, false, 70000);
	
	List<Employee> employees;
	
	public List<Employee> generateEmployee(){
	
	employees = new ArrayList<Employee>();
	employees.add(emp1);
	employees.add(emp2);
	employees.add(emp3);
	employees.add(emp4);
	employees.add(emp5);

	return employees;
	}
	
	public void addEmployee(Employee emp){
		employees.add(emp);
	}
}
