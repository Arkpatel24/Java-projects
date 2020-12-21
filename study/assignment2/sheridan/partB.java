/*partB.java is program that counts head and tail using random number
 * Author:ARK PATEL
*/
package sheridan;
import java.util.Random;//use for random
//declaration of class partB
public class partB
{
    private int countHead=0;//to count head
    private int countTail=0;//to count tail
    
    public static void main(String args[])
    {
        partB self=new partB();
        self.calculates();
        self.calculates();
        self.calculates();
        self.calculates();
        self.calculates();
        self.calculates();
        self.calculates();
        self.calculates();
        self.calculates();
        self.calculates();
        
        System.out.println("Number of times head came:" +self.countHead);
        System.out.println("Number of times tail came:" +self.countTail);
    }//end of main method
    
    public void calculates()
    {
        Random rnd = new Random();
        double rndValue;
        rndValue=rnd.nextDouble()+rnd.nextInt(1);
        
        if(rndValue>0.5)
        {
            System.out.println("Heads");
            countHead++;
        }
        else
        {
            System.out.println("Tails");
            countTail++;
        }
    }//end of calculates method
}//end of class partB