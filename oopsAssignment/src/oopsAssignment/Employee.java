package oopsAssignment;

	public class Employee { 
	    int employeeId;
	    String employeeName;
	    double salary;
	 
	    public Employee(int employeeId, String employeeName, double salary) {
	        super();
	        this.employeeId = employeeId;
	        this.employeeName = employeeName;
	        this.salary = salary;
	    }
	 
	    public int getEmployeeId() {
	        return employeeId;
	    }
	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }
	    public String getEmployeeName() {
	        return employeeName;
	    }
	    public void setEmployeeName(String employeeName) {
	        this.employeeName = employeeName;
	    }
	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(double salary) {
	       this.salary = salary;
	    }
	}
	class Manager extends Employee{
		 
	    public static final double BONUSPERCENT=0.2;
	    public Manager(int employeeId, String employeeName, double salary) {
	        super(employeeId, employeeName, salary);
	    }
	    public double getSalary() {
	        return salary+salary*BONUSPERCENT;
	    }
	}
	class Labour extends Employee{ 
	    public static final double BONUSPERCENT=0.1;
	 
	    public Labour(int employeeId, String employeeName, double salary) {
	        super(employeeId, employeeName, salary);        
	    }
	 
	    public double getSalary() {
	 
	        return salary+salary*BONUSPERCENT;
	    }
	}





