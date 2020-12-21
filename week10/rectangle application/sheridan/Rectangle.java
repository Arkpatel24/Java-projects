package  sheridan;
//declaration of class
public class Rectangle
{
    //field variable
    private int _width;//represent width of rectangle
    private int _length;//represent length of rectangle
    private char _symbol;//represenr character of rectangle
    
    //methods
    //getters and setters
    //getWidth method returns the value of  _width
    public int getWidth()
    {
        return this._width;
    }
    //setWidth method change the value of _length
    public void setWidth(int newWidth)
    {
        this._width=newWidth;
    }
     public int getLength()
    {
        return this._length;
    }
    public void setLength(int newLength)
    {
        this._length=newLength;
    }
     public char getSymbol()
    {
        return this._symbol;
    }
    public void setSymbol(char newSymbol)
    {
        this._symbol=newSymbol;
    }
    //calcRectArea method claculates and return area of rectangle
    public int calcRectArea()
    {
        return this._width*this._length;
    }
    
    public void printRectangle()
    {
        //print the rectangle
        //repeat for width from 0 to _width
        for(int iwidth=0;iwidth<this._width;iwidth++)
        {
            //repeat for length from 0 to _length
            for(int ilength=0;ilength<this._length;ilength++)
            {
                System.out.print(this._symbol);
            }
            //create new line
            System.out.println("");
        }
    }
}//end of class