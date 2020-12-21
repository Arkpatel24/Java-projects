/*partA.java ia program that displays dice values
 * Author:ARK PATEL
*/
package sheridan;
import java.util.Scanner;// scan the input
//declaration of class partA
public class partA
{
    public static void main(String args[])
    {
        //declaration of variable
        Scanner input = new Scanner(System.in);
        int userkey;
        System.out.print("Enter dice value:");
        userkey=input.nextInt();
        // switch statement to display dice value
        switch(userkey)
        {
            case 1:System.out.println("o");
                   break;
            case 2:System.out.println("o ");
                   System.out.println(" o");
                   break;
            case 3:System.out.println("o  ");
                   System.out.println(" o ");
                   System.out.println("  o");
                   break;
            case 4:System.out.println("o  o");
                   System.out.println("o  o");
                   break;
            case 5:System.out.println("o   o");
                   System.out.println("  o ");
                   System.out.println("o   o");
                   break;
            case 6:System.out.println("o  o");
                   System.out.println("o  o");
                   System.out.println("o  o");
                   break;
            default:System.out.println("Invalide value...write value between 1 to 6");
                    break;
        }//end of main method
    }//end of class partA
}