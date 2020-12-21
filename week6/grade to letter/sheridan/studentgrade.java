/*studentgrade.java convert grade to letter
 * Author:ARK PATEL
*/
package sheridan;
import java.util.Scanner;
//declaration of class
public class studentgrade
{
    public static void main(String args[])
    {
        //declaration of variable
        int grade;//represent grade which is (0-100)
        Scanner input=new Scanner(System.in);
        //input
        System.out.print("Enter a grade between (0-100)");
        grade=input.nextInt();
        
        //check the range of grade
        if(grade>=90 && grade<=100)
        {
            System.out.println("A+");
        }
        else if(grade>=80 && grade<=89)
        {
            System.out.println("A");
        }
        else if(grade>=75 && grade<=79)
        {
            System.out.println("B+");
        }
        else if(grade>=70 && grade<=74)
        {
            System.out.println("B");
        }
        else if(grade>=65 && grade<=69)
        {
            System.out.println("c+");
        }
         else if(grade>=50 && grade<=64)
        {
            System.out.println("C");
        }
        else if(grade>=0 && grade<=49 )
        {
            System.out.println("F");
        }
        else
        {
            System.out.println("Grade is not in range");
        }
    }//end of main method
}//end of class