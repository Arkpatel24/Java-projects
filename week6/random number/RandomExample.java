import java.util.Random;
public class RandomExample
{
    public static void main(String args[])
    {
        Random rnd = new Random();
        int rndValue;
        rndValue = rnd.nextInt(100)+1;
        System.out.println("Value is :"+rndValue);
    }
}