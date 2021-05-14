import java.util.Scanner;
public class totalandaveragescore {

	public static void main(String[] args) {
		int markArray[] = new int[3];
        int i;
        float sum=0;
        float total, average ;
        Scanner scan = new Scanner(System.in);
 
        System.out.print("Enter marks for 3 Subjects : ");
        for(i=0; i<3; i++){
            markArray[i] = scan.nextInt();
            sum = sum + markArray[i];
        }
 
        total = sum;
        average = sum/3;
        
        System.out.print("Total Score = " +total);
        
        System.out.print("Average Marks = " +average);
        
	}

}
