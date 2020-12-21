package sheridan;
public class RectangleTest
{
    public static void main(String args[])
    {
        Rectangle smallRectangle = new Rectangle();
        
        //use setter to change properties of smallRectangle
        smallRectangle.setWidth(3);
        smallRectangle.setLength(5);
        smallRectangle.setSymbol('?');
        
        //calculate and print area of smallRectangle
        System.out.printf("The area of small rectangle (%d,%d)is:%d %n",
                         smallRectangle.getWidth(),smallRectangle.getLength(),
                         smallRectangle.calcRectArea());
        
        //draw rectangle
        System.out.println("**The small rectangle**");
        smallRectangle.printRectangle();
    }
}