/*Ch6Ex9.java is a program which convert values from foot to meter and meter to foot
 * Author:ARK PATEL
*/
package sheridan;
import java.util.Scanner;//use of scanner
//declaration of class Ch6Ex9
public class Ch6Ex9
{
    //Declaration of main method 
    public static void main(String args[])
    {
        //Declaration and inisialization of variable
        double userfoot;
        double usermeter;
        Scanner input = new Scanner(System.in);
        Ch6Ex9 self= new Ch6Ex9();
        Double foottometer;
        Double metertofoot;
        //input from user
        System.out.print("Enter value in foot ");
        userfoot=input.nextDouble();
        //invoking methods
        foottometer=self.footToMeter(userfoot);
        System.out.println("Convertion of Foot to Meter is "+foottometer);//output
        //input from user 
        System.out.print("Enter value in meter");
        usermeter=input.nextDouble();
        //invoking method
        metertofoot=self.meterToFoot(usermeter);
        System.out.println("Convertion of Meter to Foot is "+metertofoot);//output
    }//end of main method 
    
    // Convert from foot to meters 
    public double footToMeter(double foot)
    {
       double meter = 0.305 * foot;
       return meter;//returning value
    }//end of method footToMeter
    
    // Convert from meters to foot 
    public double meterToFoot(double meter)
    {
        double foot = 3.279 * meter;
        return foot;//returning value
    }//end of method meterToFoot
}//end of class Ch6Ex9