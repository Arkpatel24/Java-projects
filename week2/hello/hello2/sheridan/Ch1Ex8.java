/* Ch1Ex8.java is a program that calculate area and parimeter of circle
 * Author: ARK PATEL
*/
package sheridan;
//defination of class Ch1Ex8
public class Ch1Ex8
{
    public static void main(String args[])
    {
        //declaration and initialization of variables
        double radius=5.5,area,parimeter;
        area=radius*radius*3.14;//calculate area of circle
        parimeter=2*radius*3.14;//calculate parimeter of circle
        System.out.println("Area of circle : " + area);
        System.out.println("Perimeter of circle : " + parimeter);
    }//end of main method
}//end of class Ch1Ex8