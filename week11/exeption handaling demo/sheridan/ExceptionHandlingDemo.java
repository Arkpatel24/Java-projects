package sheridan;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;//used for exception
public class ExceptionHandlingDemo
{
    public static void main (String args[])
    {
        ExceptionHandlingDemo self=new ExceptionHandlingDemo();
        Scanner input=new Scanner(System.in);
        int userNum;
        while(true)//repeat
        {
        try    
        {
        System.out.println("Enter a whole number:");
        userNum=input.nextInt();
        
        if(userNum==0)
        {
            break;
        }
        self.calculator(userNum);
        }
        catch(InputMismatchException e)
        {
            System.out.println("Bad Input!!" +e.getMessage());
            if(e.getMessage()==null)
            {
                System.out.println("More info."+e.getMessage());
            }
            input.nextLine();
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Bad Input "+e.getMessage());
            input.nextLine();
        }
        }
    }//end of main method
    
    //print random number between 1 to num
    public void calculator(int num)
    {
        Random rnd=new Random();
        int value;//represent random number
        
        if(num<1 || num>100)
        {
            throw new IllegalArgumentException("Value out of range..use number between 1 and 100");
        }
        value=rnd.nextInt(num)+1;
        System.out.println("The random number is "+value);
    }//end of method
}//end of class