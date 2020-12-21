package sheridan;
public class circle
{
    //field variable
    private double _radius;//represent radius of circle
    private String _color;//represent color of circle
    
    //methods
    public double getRadius()
    {
        return _radius;
    }
    public void setRadius(double newRad)
    {
        _radius=newRad;
    }
    public String getColor()
    {
        return _color;
    }
    public void setColor(String newColor)
    {
        _color=newColor;
    }
    
    public static void main(String args[])
    {
        //declaration and inisialization
        circle smallCircle = new circle();
        //set the radius and color of small circle
        smallCircle.setRadius(4.33);
        smallCircle.setColor("Green");
        
        //get specification for small circle
        System.out.println("small circle:color "+ smallCircle.getColor()+" radius "+smallCircle.getRadius());
    }
}//end of class circle