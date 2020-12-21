/*Ch1Ex11.java is a program that counts five year population
 * Author: ARK PATEL
*/
package sheridan;
//defination of class Ch1Ex11
public class Ch1Ex11
{
    public static void main(String args[])
    {
        //declaration and initialization of variables
        double birth=7,death=13,immigrant=45,population=312032486;
        double bph,dph,iph,bpd,dpd,ipd,bpy,dpy,ipy;
        double year1,year2,year3,year4,year5;
        //converting birth per second to hour
        bph=3600/birth;
        //converting death per second to hour
        dph=3600/death;
        //converting immigrant per second to hour
        iph=3600/immigrant;
        //converting birth per hour to one day
        bpd=bph*24;
        //converting death per hour to one day 
        dpd=dph*24;
        //converting immigrant per hour to one day
        ipd=iph*24;
        //converting birth per day to year
        bpy=bpd*365;
        //converting death per day to year
        dpy=dpd*365;
        //converting immigrant per day to year
        ipy=ipd*365;
        //calculating 1st year population
        year1=population+bpy-dpy+ipy;
        System.out.println("After 1st year population is " +year1);
        //calculating 2nd year population
        year2=year1+bpy-dpy+ipy;
        System.out.println("After 2nd year population is " +year2);
        //calculating 3rd year population
        year3=year2+bpy-dpy+ipy;
        System.out.println("After 3rd year population is " +year3);
        //calculating 4th year population
        year4=year3+bpy-dpy+ipy;
        System.out.println("After 4th year population is " +year4);
        //calculating 5th year population
        year5=year4+bpy-dpy+ipy;
        System.out.println("After 5th year population is " +year5);
       }//end of main method
}//end of class Ch1Ex11