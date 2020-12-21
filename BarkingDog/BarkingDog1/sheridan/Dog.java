package sheridan;
//declaration of class
public class Dog
{
    //field variable
    public String name;//represent the name of dog
    
    //print the bigbark
    public void bigBark() 
    {
        System.out.println(name + " says Woof! Woof!");
    }
    //print the smallbark
    public void smallBark()
    {
        System.out.println(name + " says Yip! Yip!");
    }
    public static void main(String[] args)
    {
        Dog one = new Dog();
        one.name = "Thor";
        Dog two = new Dog();
        two.name= "Tiny";
        one.bigBark();
        two.smallBark();
    }//end of main mathod
} // End of class Dog
