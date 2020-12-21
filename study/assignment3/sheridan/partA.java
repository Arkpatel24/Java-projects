/*partA.java is a program that claculates some simple statistic
 * Author:ARK PATEL
*/ 
package sheridan;
import java.util.Scanner;//scan input
//declaration of class partA
public class partA
{
    public static void main(String args[])
    {
        //declaration and inisialization of variable
        int count=0;
        int sum=0;
        double average=0;
        int maxValue=0;
        int minValue=0;
        int negativeValues=0;
        int positiveValues=0;
        int number;
        Scanner input=new Scanner(System.in);
        //repeat loop untill input is not 0
        do{
            //input
            System.out.println("Enter integer:");
            number=input.nextInt();
            
            //addition of inputs
            sum= sum + number;
            
            if(number > 0)
            {    
            count++;
            //find the average of input number      
            average=(double)sum/(double)count;
            }
            
            //checks the number is posivite or nagetive
            if(number > 0)
            {
                positiveValues++;
            }
            else if(number < 0)
            {
                negativeValues++;
            }
            
            //check to find minimum and maximum number
            if(number < minValue)
            {
                minValue=number;
            }
            else if(number > maxValue)
            {
                maxValue=number;
            }
            
        }while(number !=0);
         
         //print output
         System.out.println("The total of all number is:"+sum);
         System.out.println("The average of all number is:"+average);
         System.out.println("The number of positive values are:"+positiveValues);
         System.out.println("The number of negative values are:"+negativeValues);
         System.out.println("The highest number entered is:"+maxValue);
         System.out.println("The lowest number entered is:"+minValue);
        
    }//end of main method
}//end of class partA