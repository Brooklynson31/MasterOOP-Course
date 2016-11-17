package observer;

import domain.Employee;

public class PayrollDepartment implements IObserver {



	@Override
	public void callMe(Employee employee, String msg) {
		System.out.println("Payroll Department notified..");
		System.out.println(msg + " " + employee.getName());		
	}

}
