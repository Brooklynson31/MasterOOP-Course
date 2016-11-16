package reportformatters;

import domain.Employee;

public class EmployeeReportFormatter extends ReportFormatter {
	
public EmployeeReportFormatter(Employee emp, FormatType formatType) {
		super(emp, formatType);
		// TODO Auto-generated constructor stub
	}

public String getFormattedEmployee() {
	return getFormattedValue();
}


}
