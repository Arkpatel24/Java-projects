/*whileLoopEx1.java is a program that prints sum of 1 to 100 number.
 * Author : ARK PATEL
*/
package sheridan;
//declaration of class whileLoopEx1
public class whileLoopEx1
{
    //declaration of main method 
    public static void main(String args[])
    {
        //declaration and initialization of variable
        int number=1;//represent number
        int sum=0;//represent output
        //repeat for each line from 1 to 100
        while(number<=100)
        {
            sum=sum+number;
            number++;
        }    
        System.out.println("Sum of 1 to 100 is "+sum);
        
    }//end of main method
}//end of class whileLoopEx1