/*random1C.java is a program that genarate foat number between -1.0 to +1.0
 * Author:ARK PATEL
*/
package sheridan;
import java.util.Random;
//declaration of class random1C
public class random1C
{
    //declaration of main method
    public static void main(String args[])
    {
        Random rnd = new Random();
        float value;
        value = -1 + rnd.nextFloat() * (1-(-1));
        System.out.println(value);
    }//end of main method
}//end of class random1C