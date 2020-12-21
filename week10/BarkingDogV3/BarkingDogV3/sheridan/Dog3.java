package sheridan;

public class Dog3 
{
    public static final int THRESHOLD=30;
    private String _name; // represents the name of dog
    private double _weight; // represents the weight of a dog
    
    // Methods
    
    // setter and getter 
    // _name
    public void setName(String newName) {
        _name = newName;
    }
    public String getName(){
          return _name;   
    }
    // _weight
    public void setWeight(double newWeight) {
        if(_weight<0)
        {
            _weight=0;
        }
        else
        {
        _weight = newWeight;
        }
    }
    public double getWeight(){
          return _weight;   
    }
     public void bark() 
     {
         
         if(_weight < THRESHOLD ){ // small dog if _weight < 30
             System.out.println(_name + " is a small dog.");
           }
         else if(_weight>THRESHOLD){ // otherwise a big dog
              System.out.println(_name + " is a big dog.");
              }
     }
   
} // End of class Dog3
