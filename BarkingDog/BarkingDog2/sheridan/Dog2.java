package sheridan;
import java.util.Scanner;
public class Dog2
{
    private String name;
    
    public void setName(String newName)
    {
        name = newName;
    }
    public void bigBark()
    {
        System.out.println(name + " says Woof! Woof!");
    }
    public void smallBark()
    {
        System.out.println(name + " says Yip! Yip!");
    }
    public static void main (String[] args) 
    {
        Scanner input=new Scanner(System.in);
        String mydogname;
        Dog2 one = new Dog2();
        one.setName("Thor");
        Dog2 two = new Dog2();
        two.setName("Tiny");
        
        Dog2 mydog=new Dog2();
        System.out.print("enter a dog name");
        mydogname=input.nextLine();
        
        mydog.setName(mydogname);
        
        one.bigBark();
        two.smallBark();
        
        mydog.bigBark();
    }
} // End of class Dog2