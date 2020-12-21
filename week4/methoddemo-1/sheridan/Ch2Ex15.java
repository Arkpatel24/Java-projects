/* Ch2Ex15.java is a program that calculate Distance between the two points.
 * Author: ARK PATEL
*/
package sheridan;
import java.util.Scanner;
//defination of class Ch2Ex15
public class Ch2Ex15
{
    public static void main(String args[])
    {
        //declaration and initialization of variables
        double x1,x2,y1,y2,distance;
        Scanner input=new Scanner(System.in);
        
        //inputs from user
        System.out.print("Enter x1 and y1 :");
        x1=input.nextDouble();
        y1=input.nextDouble();
        System.out.print("Enter x2 and y2 :");
        x2=input.nextDouble();
        y2=input.nextDouble();
        
        //calculating distance
        distance=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("Distance between the two points is "+distance);
    }//end of main method
}//end of class Ch2Ex15