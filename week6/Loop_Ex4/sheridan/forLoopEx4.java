/*forLoopEx4.java is a program that prints number between 100 and 3000 divisible by 23.
 * Author : ARK PATEL
*/
package sheridan;
//declaration of class forLoopEx4
public class forLoopEx4
{
    //declaration of main maethod 
    public static void main(String args[])
    {
        //declaration and initialization of variable
        int number;//represent number
        int count=0;
        for(number=100;number<=3000;number++)
        {
            if(number % 23 == 0)
            {
                count++;
                System.out.println(number);
            }
        }
        System.out.println("Total number are " +count);
    }//end of main method
}//end of class forLoopEx4