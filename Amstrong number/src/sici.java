import java.util.Scanner;
public class sici {

	public static void main(String[] args) {
		 double pr, rate, t, si,ci;
		    Scanner sc=new Scanner (System. in);
		    System.out.println("Enter the amount:");
		    pr=sc.nextDouble();
		    System. out. println("Enter the No.of years:");
		    t=sc.nextDouble();
		    System. out. println("Enter the Rate of  interest");
		    rate=sc.nextDouble();
		    si=(pr * t * rate)/100;
		    ci=pr * Math.pow(1.0+rate/100.0,t) - pr;
		    System.out.println("Simple Interest="+si);
		    System.out. println("Compound Interest="+ci);

	}

}
