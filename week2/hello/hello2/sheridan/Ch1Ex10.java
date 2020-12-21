/*Ch1Ex10.java is a program that calculate average speed in miles per hours
 * Author: ARK PATEL
*/
package sheridan;
//defination of class Ch1Ex10
public class Ch1Ex10
{
    public static void main(String args[])
    {
        //declaration and initialization of variables
        double kilometer=14,minutes=45,seconds=30,miles,hours,average,h1,h2;
        //converting kilometer to miles
        miles=kilometer / 1.6;
        //converting minutes to hours
        h1=minutes/60;
        //converting seconds to hours
        h2=seconds/3600;
        //calculating hours 
        hours=h1+h2;
        //calculating speed average
        average=miles/hours;
        System.out.println("Average speed in miles per hours is "+ average);
    }//end of main method
}//end of class Ch1Ex10