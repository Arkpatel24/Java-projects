package sheridan;
import java.util.Scanner;
//declaration of class
public class trianglearea
{
    public static void main(String args[])
    {
        //declaration and initialization
        double userbase;//represent value of base
        double userheight;//represent value of height
        Scanner input= new Scanner(System.in);
        trianglearea self= new trianglearea();
        
        //input
        System.out.print("Enter the value of base");
        userbase=input.nextDouble();
        System.out.print("Enter the value of height");
        userheight=input.nextDouble();
        //call method 
        self.printtrianglearea(userbase,userheight);
    }//end of main method
    
    //calculate and prints area of triangle
    public void printtrianglearea(double base,double height)
    {
        double area;//represent the area
        
        //calculate area of the triangle
        area=(base*height)/2;
        
        //print the output
        System.out.println("The area of a triangle with base and height("+base+","+height
                               +")is : "+area);
    }//end of  method
}//end of class