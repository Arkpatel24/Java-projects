/*dowhileLoopEx2.java is a program that prints name multiple times.
 * Author : ARK PATEL
*/
package sheridan;
import java.util.Scanner;//scans input
//declaration of class dowhileLoopEx2
public class dowhileLoopEx2
{
    //declaration of main maethod 
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
        //repeat name number of time
        do
        {
            System.out.println("Your name is "+name);
            count++;
        }
        while(count<=number);
        
    }//end of main method
}//end of class dowhileLoopEx2