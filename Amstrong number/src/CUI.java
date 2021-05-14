import java.util.Scanner;
public class CUI {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.println("enter the username");
			String str = sc.next();
			System.out.println("enter the password");
			String str1 = sc.next();
		
		if(str.equals("abc") && str1.equals("pwd")) 
		{
			System.out.println("welcome" + " " +str);
			}
		else
		{
			System.out.println("contact admin");
		}
		}

	}
	

