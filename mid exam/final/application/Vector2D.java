/* Vector2D.java is program that find magnitude
 * Athour:ARK PATEL
*/
package application;
//declaration of class
public class Vector2D
{
    //field variable
    private Double _x;
    private Double _y;
    
    //parameter consturctor
     public Vector2D(Double x,Double y)
     {
         this._x=x;
         this._y=y;
     }//end of constructor
     
     //method to calculate magnitude
     public Double magnitude(Double x,Double y)
     {
         return Math.sqrt(x*x + y*y);
     }//end of method magnitude
}//end of class