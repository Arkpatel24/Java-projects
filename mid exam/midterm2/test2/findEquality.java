/*findEquality.java is program return boolean value if numbers are equal.
 * Author:ARK PAtEL
*/
package test2;
import java.util.Scanner;//scan inputs
//declaration of class findEquality
public class findEquality
{
    public static void main(String args[])
    {
        //declaration and inisialization of variable
        Scanner input = new Scanner(System.in);
        findEquality userInput = new findEquality();
        int userNum1,userNum2;//represent user inputs
        boolean userOutput;
        do
        {
        //inputs
        System.out.print("Enter first  number:");
        userNum1=input.nextInt();
        System.out.print("Enter second number:");
        userNum2=input.nextInt();
        //invoking method
        userOutput=userInput.isEqual(userNum1,userNum2);
        }while(userNum1>0 && userNum2>0);
       
    }//end of main method
    //method to compare number
    public boolean isEqual(int num1,int num2)
    {
         boolean value=true;
         boolean value2=false;
        //check number are equal
           
            if(num1 == num2)
            {
                System.out.println(value);
            }
            else
            {
                System.out.println(false);
                return value2;
            }
            return value;
        
    }//end of method isEqual    
}//end of class