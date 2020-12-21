import java.util.Random;
public class RandomEx2
{
    private int _sum=0;
    private int _count=0;
    public static void main(String args[])
    {
        RandomEx2 self=new RandomEx2();
        self.printRandom();
        self.printRandom();
        self.printRandom();  /* for(int var=o;var<5;var++)   { self.printRandom(); }  */
        self.printRandom();     
        self.printRandom();   
        
        System.out.println("Average = "+(double)self._sum/self._count);
    }
    public void printRandom()
    {
        Random rnd = new Random();
        int rndValue;
        rndValue = rnd.nextInt(100)+1;
        _sum = _sum + rndValue;
        _count = _count + 1;
        System.out.println("Random value is :"+rndValue);
    }
}