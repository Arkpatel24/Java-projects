/*ICE10.java is program that print the month when user input number
 * Author:ARK PATEL
*/ 
package sheridan;
import java.util.Scanner;//scans input
//declaration of class ICE10
public class ICE10
{
    public static void main(String args[])
    {
        //declaration of variable
        ICE10 self=new ICE10();
        Scanner input = new Scanner(System.in);
        int usernum;
        //input
        System.out.println("Enter nummber from 1 to 12 to see month");
        usernum=input.nextInt();
        //invoking method numToMonth
        self.numToMonth(usernum);
    }//end of main method
    //declaration of method numToMonth
    public int numToMonth(int month)
    {
        //declaration of array
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("monthNames["+month+"]="+monthNames[month-1]);//output
        return (month-1);//returning statement
    }//end of method numToMonth
}//end of class ICE10