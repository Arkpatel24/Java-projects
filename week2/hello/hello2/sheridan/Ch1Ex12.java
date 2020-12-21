/* Ch1Ex12.java is a program that calculate average speed in kilometer per hours
 * Author: ARK PATEL
*/
package sheridan;
//defination of class Ch1Ex12
public class Ch1Ex12
{
    public static void main(String args[])
    {
        //declaration and initialization of variables
        double miles=24,minutes=40,seconds=35,kilometer,hours,average,h1=1,h2,h3;
        //converting miles to kilometer 
        kilometer=miles * 1.6;
        //converting minutes to hours
        h2=minutes/60;
        //converting seconds to hours
        h3=seconds/3600;
        //calculating hours 
        hours=h1+h2+h3;
        //calculating speed average
        average=kilometer/hours;
        System.out.println("Average speed in kilometer per hours is "+ average);
    }//end of main method
}//end of class Ch1Ex12