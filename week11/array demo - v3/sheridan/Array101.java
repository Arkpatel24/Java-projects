package sheridan;
import java.util.Random;//use for random
public class Array101
{
    public static final int ARRAY_SIZE=5;
    public static void main(String args[])
    {
        //declaration and inisialization of variable
        Random rnd = new Random();
        int[] numBox = new int[100]; 
    
        //inisializing the element to expression
        for(int index=0;index<numBox.length;index++)
        {
            numBox[index]=rnd.nextInt(101); 
            System.out.println("numBox["+index+"]="+numBox[index]);
        }
          
  
    }//end of main method
}//end of clsss
