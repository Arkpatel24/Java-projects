package sheridan;
//declaraton of class ICE12
public class ICE12 
{
    //feild varaibles
    private String _name; // represent the name of dog
    private double _weight; // represent the weight of a dog
    
    // default constructor
    public ICE12()
    {
        this("Bravo",30);
    }
    //ICE12 constructor initializes the name and weight 
       
     public ICE12(String name,double weight)
     {
        this._name=name;
        this._weight=weight;
    }
      // setter and getter 
    public void setName(String newName) 
    {
        _name = newName;
    }    
    public String getName()
    {
          return this._name;   
    }
   
    public void setWeight(double newWeight)
    {   
        // represent  the weight to the object
        _weight = newWeight;
    }
        
    public double getWeight()
    {
        return _weight;   
    }
     public void bark()
     {            
         if ( _weight <= 30 )
         {
             // small dog if _weight < 30
             System.out.println(_name + " is small dog.");
         }
         else if(_weight > 30)
         {
             // otherwise a big dog
              System.out.println(_name + " is big dog.");
         }
        
    }//end of the bark
   
} // end of class ICE12
