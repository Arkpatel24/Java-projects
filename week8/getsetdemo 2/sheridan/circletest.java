/*circletest.java is testing routine to create circle object

*/
package sheridan;
public class circletest
{
    //field variable
    private double _radius;//represent radius of circle
    private String _color;//represent color of circle
    
    
    public static void main(String args[])
    {
        //declaration and inisialization
        circle smallCircle = new circle();
        //set the radius and color of small circle
        smallCircle.setRadius(4.33);
        smallCircle.setColor("Green");
        
        //get specification for small circle
        System.out.println("small circle:color "+ smallCircle.getColor()+" radius "+smallCircle.getRadius());
        
        System.out.printf("Parameter is %.2f",smallCircle.getRadius(),smallCircle.calcCircParameter(2));
    }
  
}//end of class circle