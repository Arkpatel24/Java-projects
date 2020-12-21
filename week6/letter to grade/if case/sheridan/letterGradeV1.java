/*letterGradeV1.java convert letter to grade using if else case
 * Author: ARK PATEL
*/
package sheridan;
import java.util.Scanner;//scan the input
//declaration of class
public class letterGradeV1
{
    public static void main(String args[])
    {
        //declaration of variable
        String grade;//represent grade which is (0-100)
        Scanner input=new Scanner(System.in);
        
        //input
        System.out.print("Enter a grade between (0-100)");
        grade=input.nextLine();
        
        //check the range of grade
        if(grade.equals("A+"))
        {
            System.out.println("Grade is Between 90 to 100");
        }
        else if(grade.equals("A"))
        {
            System.out.println("Grade is between 80 to 90");
        }
        else if(grade.equals("B+"))
        {
            System.out.println("Grade is between 75 t0 79");
        }
        else if(grade.equals("B"))
        {
            System.out.println("Grade is between 70 to 74");
        }
        else if(grade.equals("C+"))
        {
            System.out.println("Grade is between 65 to 69");
        }
         else if(grade.equals("C"))
        {
            System.out.println("Grade is between 50 to 64");
        }
        else if(grade.equals("F"))
        {
            System.out.println("Grade is between 0 to 49");
        }
        else
        {
            System.out.println("Grade is invalid");
        }
    }//end of main method
}//end of class letterGradeV1