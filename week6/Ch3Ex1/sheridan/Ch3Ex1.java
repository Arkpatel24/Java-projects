/* Ch3Ex1.java is a program that calculates quadratic equation
 * Author : ARK PATEL
*/

package sheridan;
import java.util.Scanner;//scan the inputs
// declaration of class
public class Ch3Ex1
{
    public static void main(String[] args) 
      {
        // declaration of variables 
        double a, b, c;
        double root1, root2, discriminant;
        Scanner input = new Scanner(System.in);
        //inputs
        System.out.print("Enter a:");
        a = input.nextInt();
        System.out.print("Enter b:");
        b = input.nextInt();
        System.out.print("Enter c:");
        c = input.nextInt();
        // calculates the discriminent 
        discriminant = b * b - 4 * a * c;
        if(discriminant > 0)
        {
            root1 = (- b + Math.sqrt(discriminant))/(2*a);
            root2 = (-b - Math.sqrt(discriminant))/(2*a);
            System.out.println("Equation has two roots");
            System.out.println("First root is:"+root1);
            System.out.println("Second root is:"+root2);
        }
        else if(discriminant == 0)
        {
            root1 = (-b + Math.sqrt(discriminant))/(2*a);
            System.out.println("Equation has one roots");
            System.out.println("Root:"+root1);
        }
        else
        {
            System.out.println("Equation has no real root");
        }
    }//end of main method
}//end of class Ch3Ex1