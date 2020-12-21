package sheridan;
public class circle
{
    //field variable
    private double _radius;//represent radius of circle
    private String _color;//represent color of circle
    
    //methods
    public double getRadius()
    {
        return this._radius;
    }
    public void setRadius(double newRad)
    {
        this._radius=newRad;
    }
    public String getColor()
    {
        return this._color;
    }
    public void setColor(String newColor)
    {
        this._color=newColor;
    }
    public double calcCircParameter(double _radius)
    {
        return 2 * Math.PI * this._radius;
    }
   
}//end of class circle