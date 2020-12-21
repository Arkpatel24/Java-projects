/* keyboardapplication.java is program that enter number on the keypad movement
 * Author : ARK PATEL
 */

package sheridan;
import java.util.Scanner;
public class keyboardapplication
{
    public static void main(String args[])
    {
        int userkey;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a key");
        userkey=input.nextInt();
        
        //check the key value to determine the movement
        switch(userkey)
        {
            case 2: System.out.println("Down");
                    break;
            case 4: System.out.println("Left");
                    break;
            case 6: System.out.println("Right");
                    break;
            case 8: System.out.println("Up");
                    break;
            case 1:
            case 3:
            case 5:
            case 7:
                    System.out.println("Diagonal move not allowed");
                    break;
            default :System.out.println("Bad input");
                     break; 
        }
    }
}