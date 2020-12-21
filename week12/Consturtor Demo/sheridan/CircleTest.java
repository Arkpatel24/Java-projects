
package sheridan;

public class CircleTest
{
    public static void main (String args[])
    {
        //declaration and inisialization
        Circle defaultCirc=new Circle();
        Circle myCircle=new Circle(4,"Blue");
        
        //print color and radius of default circle
        System.out.println("The color is "+defaultCirc.getColor()+" The radius is "+defaultCirc.getRadius());
        
        //print color and radius of myCircle
        System.out.println("The color is "+myCircle.getColor()+" The radius is "+myCircle.getRadius());
        
        //change radius and color
        myCircle.setRadius(9.4);
        myCircle.setColor("Black");
        System.out.println("The color is "+myCircle.getColor()+" The radius is "+myCircle.getRadius());
    }//end of main method
}///end of class