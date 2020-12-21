/*Ch6Ex9.java is a program which convert values from foot to meter and meter to foot
 * Author:ARK PATEL
*/
package sheridan;
//declaration of class Ch6Ex9
public class Ch6Ex9
{
    //Declaration of main method 
    public static void main(String args[])
    {
        //Declaration and inisialization of variable
        double feet;
        double mtr;
        Ch6Ex9 self= new Ch6Ex9();
        
        //invoking method
        mtr=self.footToMeter(0);
        feet=self.meterToFoot(0);
        
    }//end of main method 
    
    // Convert from foot to meters 
    public double footToMeter(double foot)
    {
       double meter=0;
       System.out.println("Foot       Meter");
       //its repeats from 1 to 10
       for(foot=1;foot<=10;foot++)
       {
           meter = 0.305 * foot;
           System.out.print(foot +"    :   ");
           System.out.printf("%.3f %n",meter);//output
       }
       return meter;//returning value
    }//end of method footToMeter
    
    // Convert from meters to foot 
    public double meterToFoot(double meter)
    {
        double foot=0;
        System.out.println("Meter      Foot");
        //its repeats from 1 to 10
        for(meter=1;meter<=10;meter++)
        {
            foot = 3.279 * meter;
            System.out.print(meter+"    :   ");
            System.out.printf("%.3f %n",foot);//output
        }    
        return foot;//returning value
    }//end of method meterToFoot
}//end of class Ch6Ex9