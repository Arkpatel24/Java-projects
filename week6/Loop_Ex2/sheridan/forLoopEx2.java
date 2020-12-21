/*forLoopEx2.java is a program that prints name multiple times.
 * Author : ARK PATEL
*/
package sheridan;
import java.util.Scanner;//scans input
//declaration of class forLoopEx2
public class forLoopEx2
{
    //declaration of main maethod 
    public static void main(String args[])
    {
        //declaration and initialization of variable
        String name;//represent name
        int number;//represent numbers for output
        int count;
        Scanner input= new Scanner(System.in);
        // input 
        System.out.print("Enter your name");
        name=input.nextLine();
        System.out.print("Enter number of times you want to print your name");
        number=input.nextInt();
        //repeat for each line 
        for(count=1;count<=number;count++)
        {
            System.out.println("Your name is "+name);
        }
    }//end of main method
}//end of class forLoopEx2