/*Histogram.java is a program that print star that many times array has stored number
 * Author:ARK PATEL
*/ 
package sheridan;
import java.util.Scanner;//scan the input
//declaration of class Histogram
public class Histogram
{
    public static void main(String[] args)
    {
        //declaration and initialization
        int count,i;
        Histogram self=new Histogram();
        Scanner input=new Scanner(System.in);
        //inputs
        System.out.print("Enter the number of elements you want: ");
        count=input.nextInt();
        int[] num=new int[count];
        //repeat the number 
        for(i=0; i<count; i++)
        {
            //taking the array input from user
            System.out.print("Enter Element : ");
            num[i]=input.nextInt();
            //check number between 0 to 10
            while(num[i]<0 ||  num[i]>10)
                {    
                     System.out.println("Bad Input! please enter number between 0 and 10.");  
                     System.out.print("Enter Element : ");
                     num[i]=input.nextInt();
                }
        }
        //invoking method   
        self.printHistogram(num,count);
    }//end of main method
    
    //declaration of method printHistrogram
    public void printHistogram(int[] number,int count)
    {
        //repeat loop to print * number of time
        for(int i=0; i<count;i++)
        {
            System.out.print("Element "+(i+1));
            for(int j=0;j<number[i];j++ )
            {              
                System.out.print(" *");
            }    
            System.out.println();
        }
    }//end of printHistogram
    
}//end of class Histogram
