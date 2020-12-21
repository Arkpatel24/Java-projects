/* HoroscopeApp.java is a program that print random string 
 * Author:ARK PATEL
*/ 
package sheridan;
import java.util.Scanner;//scan input
//declaration of class HoroscopeApp
public class HoroscopeApp
{
    public static void main(String args[])
    {
        //declaration and inisialization of variable
        Horoscope obj = new Horoscope();
        Scanner input = new Scanner(System.in);
        String prediction;
        int counter=0;//count number
        //repeat input 10 times
        for(int num=0;num<10;num++)
        {
            System.out.print("Enter your predictons:");
            prediction=input.nextLine();
            if(!prediction.equals(""))//checking string is null or not
            {
                obj.list[num]=prediction;
            }
            else
            {
                break;
            }
            counter++;
        }
        //invoking variable and method
        obj._counter=counter;
        obj.randomPrediction();
    }//end of main method
}//end of class HoroscopeApp