package sheridan;
//declaration of class
public class Circle
{
    //feild variable
    private double _radius;
    private String _color;
    
    //constructor
    public Circle()
    {
        //this._radius=1;
        //this._color="White";
        this(1,"White");
    }
    public Circle(double rad,String col)
    {
        //initialize field variable
        this._radius = rad;
        this._color = col;
    }
    
    //getters and setters
    public double getRadius()
    {
        return this._radius;
    }
    public void setRadius(double newRad)
    {
        this._radius = newRad;
    }
    public String getColor()
    {
        return this._color;
    }
    public void setColor(String newCol)
    {
        this._color = newCol;
    }
}//end of class