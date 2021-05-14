package oopsAssignment;

public class MethodOverridingMain {
 
    
    public static void main(String[] args) {
        Labour l1=new Labour(1,"Arpit" ,20000);
        Labour l2=new Labour(2,"John" ,15000);
        Manager m1=new Manager(1,"Amit" ,30000);
        Manager m2=new Manager(2,"Ashwin" ,50000);
 
        System.out.println("Name of Employee:" +l1.getEmployeeName()+"---"+"Salary:"+l1.getSalary());
        System.out.println("Name of Employee:" +l2.getEmployeeName()+"---"+"Salary:"+l2.getSalary());
        System.out.println("Name of Employee:" +m1.getEmployeeName()+"---"+"Salary:"+m1.getSalary());
        System.out.println("Name of Employee:" +m2.getEmployeeName()+"---"+"Salary:"+m2.getSalary());
    }

}
