/*letterGradeV2.java convert letter to grade using switch case
 * Author: ARK PATEL
*/
package sheridan;
import java.util.Scanner;//scan the input
//declaration of class
public class letterGradeV2
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
        switch(grade)
        {
            case "A+":System.out.println("Grade is Between 90 to 100");
                     break;
                     
            case "A":System.out.println("Grade is between 80 to 90");
                     break;
                     
            case "B+":System.out.println("Grade is between 75 t0 79");
                      break;
       
            case "B":System.out.println("Grade is between 70 to 74");
                      break;
        
            case "C+":System.out.println("Grade is between 65 to 69");
                      break;
         
            case "C":System.out.println("Grade is between 50 to 64");
                      break;
         
            case "F":System.out.println("Grade is between 0 to 49");
                      break;
                     
            default :System.out.println("Grade is invalid");
                      break;
        }
    }//end of main method
}//end of class letterGradeV2