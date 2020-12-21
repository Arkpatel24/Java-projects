package sheridan;
import java.util.Random; // used to generate random values
public class RandomGenerator
{
    Random _rnd = new Random();
    public static void main(String[] args)
    {
        //declaration
        RandomGenerator self= new RandomGenerator();
        System.out.println("The random value is: " + self.randNumber());
        
    }// end of the main method
    
    public int randNumber()
    {
        // Declarations & initializations
        int randomValue; // represents the random number 0 - 9
        // generate a random value 0 - 9
        randomValue=_rnd.nextInt(10);
        return randomValue;
        
    }
}// end of the class