/*RectangleMaker.java is a program that display three type of dimension rectangle
 * Author:ARK PATEL
*/ 
package sheridan;
//declaration of class RectangleMaker
public class RectangleMaker
{
    //field variable
    private int _width;//represent the width of the rectangle
    private int _height;//represent the height of the rectangle
    private char _symbol;//represent the character of the rectangle
    
    //setter method
    public void setWidth(int newWidth)
    {
        this._width=newWidth;
    }
    public void setHeight(int newHeight)
    {
        this._height=newHeight;
    }
    public void setSymbol(char newSymbol)
    {
        this._symbol=newSymbol;
    }
    
    //print rectangle symbol
    public void printRectangle()
    {
        //repeat the width from 0 to _width
        for(int iWidth=0; iWidth < this._width; iWidth++)
        {
            //repeat for length from 0 to _length
            for(int iHeight=0; iHeight < this._height; iHeight++)
            {
                System.out.print(this._symbol);
            }
            //create a new line after a current row
            System.out.println("");
        }
    }
    
    public static void main(String[] args)
    {
        //Decalaration and initialization
        RectangleMaker rect=new RectangleMaker();
        RectangleMaker rect1=new RectangleMaker();
        RectangleMaker rect2=new RectangleMaker();
           
        //invoking methods
        rect.setWidth(3);
        rect.setHeight(4);
        rect.setSymbol('0');
        
        rect1.setWidth(7);
        rect1.setHeight(14);
        rect1.setSymbol('T');
        
        rect2.setWidth(5);
        rect2.setHeight(2);
        rect2.setSymbol('[');
              
        //Draw the rectangle       
        rect.printRectangle(); 
        System.out.println("");
        rect1.printRectangle();
        System.out.println("");
        rect2.printRectangle();
    }//end of main method
}//end of class RectangleMaker
