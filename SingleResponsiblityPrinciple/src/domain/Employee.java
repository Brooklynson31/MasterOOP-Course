package domain;

public class Employee {
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", working=" + working + "]";
	}

	private Long id;
	private String name;
	private String department;
	private boolean working;
	
	public Employee(Long id, String name, String department, boolean working) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.working = working;
	}
	
	private void saveEmployee(Employee emp){
		System.out.println("saving employee to database...");

		
	}

	
	

}
