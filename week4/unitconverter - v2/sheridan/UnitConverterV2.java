/*UnitConverter.java convert kilometers to miles
 * author:Ark Patel
 * version:1
*/
package sheridan;
import java.io.*;
import java.util.Scanner;//used to scan input

//defination of class
public class UnitConverterV2
{
    public static void main(String args[])
    {
        //declaration and inisilization
        double milestoKms=1.609;
        double distanceinKms;//represent values in meter
        double distanceinMiles;//represent values in miles
        String name;//represent name of the user
        Scanner input=new Scanner(System.in);
        
        System.out.print("What is your name??");
        name=input.nextLine();
        System.out.print(name+" Enter the distance in kms:");
        distanceinKms=input.nextDouble();
            
        //convert kms to miles
        distanceinMiles=distanceinKms/milestoKms;
        System.out.println(distanceinKms+"kms is equivalent to "+distanceinMiles+" in miles.");
    }//end of main method
} //end of class