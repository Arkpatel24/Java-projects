package sheridan;
import java.util.Random;//used to generate random number
public class whileExe3
{
    public static void main(String args[])
    {
        //declaration and inisialization
        Random rnd = new Random();
        double rndValue=0;
        //generate random number
        rndValue = rnd.nextDouble();
        while(true)//repeat the loop forever
        {
            
            if(rndValue >= 0.99)
            {
                System.out.println("The random value (>0.99) "+rndValue);
                break;
            }
            else
            {
                //generate a new random number
                rndValue = rnd.nextDouble();
            }
        }
    }
}//end of class