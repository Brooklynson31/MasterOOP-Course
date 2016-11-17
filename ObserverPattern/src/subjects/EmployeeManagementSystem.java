package subjects;

import java.util.ArrayList;
import java.util.List;

import dao.EmployeeDAO;
import domain.Employee;
import observer.IObserver;

public class EmployeeManagementSystem extends ISubject {
	
	private List<Employee> employees;
	private EmployeeDAO employeedao;
	private List<IObserver> observerlist;
	private String msg;
	private Employee employee;
	
	public EmployeeManagementSystem(){
		this.employeedao = new EmployeeDAO();
		this.observerlist = new ArrayList<IObserver>();

		employees = employeedao.generateEmployee();
	}

	public void registerObserver(IObserver observer) {
		observerlist.add(observer);
		
	}

	public void hireNewEmployee(Employee emp) {
		setStatechange(true);
		employee = emp;
		msg = "New Hire:";
		employees.add(emp);
		notifyAllDepartments();
	}
	
	//notify observers method
	public void notifyAllDepartments(){
		if(isStatechange()){
			for(IObserver it: observerlist){
			it.callMe( employee, msg);
			}
		}
	}

	public void modifyEmployeeName(int id, String newName){
		setStatechange(false);
		
		for(Employee emp: employees){
			if(id == emp.getId()){
				emp.setName(newName);
				this.employee = emp;
				this.msg = "Employee name has been modified";
				setStatechange(true);
			}
		}
		if(isStatechange()){
			notifyAllDepartments();
		}
	}



	@Override
	public void unregisterObserver(IObserver obj) {
		observerlist.remove(obj);
	}

}
