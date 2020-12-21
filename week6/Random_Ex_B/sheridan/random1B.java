/*random1B.java is a program that genarate foat number between 15.0 to 20.0
 * Author:ARK PATEL
*/
package sheridan;
import java.util.Random;
//declaration of class random1B
public class random1B
{
    //declaration of main method
    public static void main(String args[])
    {
        Random rnd = new Random();
        float value;
        value = 15 + rnd.nextFloat() * (20-15);
        System.out.println(value);
    }//end of main method
}//end of class random1B