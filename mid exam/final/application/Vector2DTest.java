/*
 * Athor:ARK PATEL
 */
package application;
import java.util.Scanner;//scans input
//declartion of class Vector2DTest
public class Vector2DTest
{
    public static void main(String args[])
    {
        //declaration and inisialization of variable
        Scanner input=new Scanner(System.in);
        Double x,y,average;
        System.out.println("Enter X and Y coordinates for first vector: " );
        x=input.nextDouble();
        y=input.nextDouble();
        Vector2D v1=new Vector2D(x,y);
        //input for vector 2
        System.out.println("Enter X and Y coordinates for second vector: " );
        x=input.nextDouble();
        y=input.nextDouble();
        Vector2D v2=new Vector2D(x,y);
        
        //printing the magnitude of both vectors 
        System.out.println("The magnitude of first vector is: "+v1.magnitude(x,y));
        
        System.out.println("The magnitude of second vector is: "+v2.magnitude(x,y));
        
        //printing the average
        average= (v1.magnitude(x,y)+v2.magnitude(x,y))/2;
        System.out.printf("The average magnitude of both vectors is: %.2f",average);


    }//end of main method
    
}//end of class Vector2DTest