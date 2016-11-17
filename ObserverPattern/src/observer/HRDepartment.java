package observer;

import domain.Employee;

public class HRDepartment implements IObserver{



	@Override
	public void callMe(Employee employee, String msg) {
		System.out.println("HR Department notified..");
		System.out.println(msg + " " + employee.getName());

	}

}
