package collectionframework;
import java.util.HashSet;

public class Employee {
	String name;
	int age;
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj == this)
			return true;
		if(!(obj instanceof Employee))
			return false;
		Employee emp = (Employee) obj;
		return emp.getAge() ==this.getAge() 
				&& emp.getName() == this.getName();
	}
	@Override
	public int hashCode() {
		int result = 17;
		result=31*result+age;
		result=31*result+(name!=null ? name.hashCode():0);
		return result;
	}
}

class CleintTest{
	public static void main(String[] args) {
		Employee emp = new Employee("Raghu",24);
		Employee emp1 = new Employee("Raghu",22);
		Employee emp2 = new Employee("Raghu",21);
		
		HashSet<Employee> emps = new HashSet<Employee>();
		emps.add(emp);
		System.out.println(emps.contains(emp2));
		System.out.println("employee.hashcode(): " + emp.hashCode() + 
				"employee1.hashcode(): " + emp1.hashCode()
		+"employee2.hashcode(): " +emp2.hashCode());
		

	}

	}

