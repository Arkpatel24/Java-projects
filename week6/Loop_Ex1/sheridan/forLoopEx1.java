/*forLoopEx1.java is a program that prints sum of 1 to 100 number.
 * Author : ARK PATEL
*/
package sheridan;
//declaration of class forLoopEx1
public class forLoopEx1
{
    //declaration of main method 
    public static void main(String args[])
    {
        //declaration and initialization of variable
        int number;//represent number
        int sum=0;//represent output
        //repeat for each line from 1 to 100
        for(number=1;number<=100;number++)
        {
            sum=sum+number;
            System.out.println("Sum of 1 to 100 is "+sum);
        }
    }//end of main method
}//end of class forLoopEx1