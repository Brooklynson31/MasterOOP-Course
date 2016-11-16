package clients;

import dao.EmployeeDAO;
import domain.Employee;
import reportformatters.EmployeeReportFormatter;
import reportformatters.FormatType;

public class ClientModule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee Mike = new Employee(1L, "Mike","Emergency", true);
		
		ClientModule.hireNewEmployee(Mike);
		ClientModule.terminateEmployee(Mike);
		
		
		
	}
	
	public static void hireNewEmployee(Employee emp){
		EmployeeDAO employeedao = new EmployeeDAO();
		employeedao.saveEmployee(emp);
	}
	
	public static void terminateEmployee(Employee emp){
		EmployeeDAO employeedao = new EmployeeDAO();
		employeedao.deleteEmployee(emp);
 
	}
	
	public static void printEmployeeReport(Employee emp, FormatType formatType){
		EmployeeReportFormatter formatter = new EmployeeReportFormatter(emp,formatType);
			System.out.println(formatter.getFormattedEmployee());

	}

}
