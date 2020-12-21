/* Horoscope.java is a program that print random string 
 * Author:ARK PATEL
*/
package sheridan;
import java.util.Random;//to generate random number
//declaration of class Horoscope
public class Horoscope
{
    // declaration varaible and array
    public int _counter;
    public String[] list=new String[10];
    HoroscopeApp main=new HoroscopeApp();
    Random rnd = new Random();
    //declaration of method randomPrediction
    public void randomPrediction()
    {
        int num;
        num=rnd.nextInt(_counter);
        System.out.println("Random Prediction is:"+list[num]);//print output
    }//end of method randomPrediction
}//end of class Horoscope