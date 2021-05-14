import java.util.Scanner;

public class passfail
{
    public static void main(String args[])
    {
    	/* This program assumes that the student has 6 subjects,
    	 * thats why I have created the array of size 6. You can
    	 * change this as per the requirement.
    	 */
        int marks[] = new int[3];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<3; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        
        if(total>=180)
        {
            System.out.println("pass");
        }
        else if(total>=120)
        {
           System.out.println("promoted");
        } 
        else if(total>=60 && total<60)
        {
            System.out.println("fail");
        }
        
    }
}