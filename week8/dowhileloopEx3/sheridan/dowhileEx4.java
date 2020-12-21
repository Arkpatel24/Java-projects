/*dowhileEx4.java is program that display number greater 0.99
Author:ARK PATEL
*/
package sheridan;
import java.util.Random;//used to generate random number
public class dowhileEx4
{
    public static void main(String args[])
    {
        //declaration and inisialization
        Random rnd = new Random();
        double rndValue=0;
        //generate random number
        rndValue = rnd.nextDouble();
        do//repeat the loop
        {
            
            if(rndValue >= 0.99)
            {
                System.out.println("The random value (>0.99) "+rndValue);
                break;
            }      
         rndValue = rnd.nextDouble();
        }
        while(true);
    }//end of main method
}//end of class