/*whileLoopEx4.java is a program that prints number between 100 and 3000 divisible by 23.
 * Author : ARK PATEL
*/
package sheridan;
//declaration of class whileLoopEx4
public class whileLoopEx4
{
    //declaration of main maethod 
    public static void main(String args[])
    {
        //declaration and initialization of variable
        int number=100;//represent number
        int count=0;
        while(number<=3000)
        {
            if(number % 23 == 0)
            {
                count++;
                System.out.println(number);
            }
            number++;
        }
        System.out.println("Total number are " +count);
    }//end of main method
}//end of class whileLoopEx4