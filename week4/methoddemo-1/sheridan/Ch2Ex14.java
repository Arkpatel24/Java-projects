/* Ch2Ex14.java is a program that calculate Body Mass Index
 * Author: ARK PATEL
*/
package sheridan;
import java.util.Scanner;
//defination of class Ch2Ex14
public class Ch2Ex14
{
    public static void main(String args[])
    {
        //declaration and initialization of variables
        double bmi,kilograms,pounds,inches,meters;
        Scanner input= new Scanner(System.in);
        
        //input from user
        System.out.print("Enter weight in pounds :");
        pounds=input.nextDouble();
        System.out.print("Enter height in inches :");
        inches=input.nextDouble();
        
        //converting pounds into kilograms
        kilograms=pounds*0.45359237;
        //converting inches into meters
        meters=inches*0.0254;
        
        //calculating Body Mass Index
        bmi=kilograms/Math.pow(meters,2);
        
        System.out.println("BMI is "+bmi);
    }//end of main method
}//end of class Ch2Ex14