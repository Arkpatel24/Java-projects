/*whileLoopEx2.java is a program that prints name multiple times.
 * Author : ARK PATEL
*/
package sheridan;
import java.util.Scanner;//scans input
//declaration of class whileLoopEx2
public class whileLoopEx2
{
    //declaration of main method 
    public static void main(String args[])
    {
        //declaration and initialization of variable
        String name;//represent name
        int number;//represent numbers for output
        int count=1;
        Scanner input= new Scanner(System.in);
        // input 
        System.out.print("Enter your name");
        name=input.nextLine();
        System.out.print("Enter number of times you want to print your name");
        number=input.nextInt();
        //repeat for each line 
        while(count<=number)
        {
            System.out.println("Your name is "+name);
            count++;
        }
    }//end of main method
}//end of class whileLoopEx2