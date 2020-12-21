/*Quize2.java is a program that calculates vale of pi
 * Author:ARK PATEL
 * Student ID:991543965
*/ 
package sheridan;
import java.util.Scanner;//scan inputs
//declaration of class Quize2
public class Quize2
{
   //declaration of main method
    public static void main(String args[])
    {
        //declaration and inisialization of variables
        Quize2 self=new Quize2();
        double result;//prints output
        int userLoopEnd;//user input
        Scanner input=new Scanner(System.in);
        //input
        System.out.print("Enter the loop endpoint number:");
        userLoopEnd=input.nextInt();
        //invoking calculate method
        result=self.calculate(userLoopEnd);
        System.out.println("Value of pi is:"+result);
    }//end of main method
    //declaration of calculate method
    public double calculate(int loopEnd)
    {
        //declaration and inisialization of variables
        double pi=0;
        double total=0;
        double count=1;
        //repeat the loop till user input
        while(count<=loopEnd)
        {
            total=total+(1.0/count);
            count=count+2;
            total=total-(1.0/(count+2));
            count=count+2;
        }
        pi=total*4;//calculates pi 
        return pi;//return value of pi
    }//end of calculate method
}//end of class Quize2