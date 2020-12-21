package sheridan;
import java.util.Random;//used to generate random number
public class dowhileExe3
{
    public static void main(String args[])
    {
        //declaration and inisialization
        Random rnd = new Random();
        double rndValue=0;
       
        do//repeat the loop forever
        {
             //generate random number
             rndValue = rnd.nextDouble();
        
            if(rndValue >= 0.99)
            {
                System.out.println("The random value (>0.99) "+rndValue);
                break;
            }
        }    
        while(rndValue < 0.99);
        
    }
}//end of class
