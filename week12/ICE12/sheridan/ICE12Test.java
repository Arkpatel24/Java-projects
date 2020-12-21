/* ICE12.java is a program that use constructor 
 * Author :ARK PATEL
 */ 
package sheridan;
//declaration of class
public class ICE12Test
{
     public static void main (String[] args)
     {
        // Declarations & Initializations   
        // set the name of objects using  setter
        ICE12 one = new ICE12();
        ICE12 two = new ICE12("Branda",40); 
        // print the name of  objects using getter
        System.out.println("Dog 1 name is: " + one.getName()); 
        System.out.println("Dog 2 name is: " + two.getName());  
        
        // Change the name to  Rocky
        one.setName("Rocky"); 
        System.out.println("Dog 1 name after change is: " + one.getName());  
        // Change the weight to  20
        two.setWeight(20); 
        System.out.println("Dog 2 weight after change is: " + two.getWeight());  
       
        // invoking the methods  
        one.bark();
        two.bark();
     
    }//end of the main method
}//end of the class ICE12Test