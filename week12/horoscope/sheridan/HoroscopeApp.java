package sheridan;
import java.util.Scanner;
public class HoroscopeApp
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String userPrediction;
        int count=0;
        Horoscope horoscope=new Horoscope();
        while(true)
        {
            System.out.print("Enter a prediction :");
            userPrediction=input.nextLine();
            //if the prediction count is greater  than 10
            if(count>10 || userPrediction.equals(""))
            {
                break;
            }
            horoscope.addPrediction(userPrediction);
            count++;
            System.out.println("count of prediction:"+count);
        }
    }//end of main method
}//end of class