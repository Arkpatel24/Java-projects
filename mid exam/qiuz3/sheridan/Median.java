/*Median.java is program that sort array and find middle number
 * Author:ARK PATEL
*/ 
package sheridan;
import java.util.Scanner;//scans the input
import java.util.Arrays;//to use to sort method
//declaration of class Median
public class Median
{
    //field variable
    public static final int ARRAY_SIZE=7;
    //declaration of main method
    public static void main(String args[])
    {
        //declaration of variables 
       double[] num =new double[ARRAY_SIZE]; 
       Scanner input =new Scanner(System.in);
       Median self = new Median();
       //input
       System.out.print("Enter"+ARRAY_SIZE+" numbers to find middle number amoung them:");
       num= input.nextDouble();
       
       //invoking method calcMedian
       double result=self.calcMedian(num);
       System.out.println("Middle number is:"+result);//output
    }//end of main method
    
    //declaration of calcMedian method
    public double calcMedian(double[] number)
    {
        //sorting array
        Arrays.sort(number); 
        //print sorted array
        System.out.println("Sorted array is:"+Arrays.toString(number)); 
        //find middle number
        double median;
        //check number is odd or even 
        if (number.length % 2 == 0)
        {
            median = ((double)number[number.length/2] + (double)number[number.length/2 - 1])/2;
        }    
        else
        {
            median = (double) number[number.length/2];
        }
        return median;//returning median
    }//end of method clacMedian
}//end of class Median