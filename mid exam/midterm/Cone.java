/* Cone.java is program that calculates surface area of cone
 * Author :ARK PATEL
 */

package midterm;
import java.util.Scanner;//to use scanner 
//declaration of class Cone
public class Cone
{
    //declaration of main method
    public static void main(String[] args)
    {
        //declaration and inisialization of varaibles
        double radius;//radius of cone 
        double height;//height of cone
        double surfaceArea;//surface area of cone
        Scanner input= new Scanner(System.in);//scans the input
        
        //user enter the input
        System.out.print("Enter the radius of cone :");
        radius=input.nextDouble();
        System.out.print("Enter the height of cone :");
        height=input.nextDouble();
        
        //Calculates the surface area of cone
        surfaceArea=Math.PI*radius*(radius+(Math.sqrt(Math.pow(height,2)+(Math.pow(radius,2)))));
        System.out.println("Surface area of cone is "+surfaceArea);
    }//end of main method
}//end of class Cone