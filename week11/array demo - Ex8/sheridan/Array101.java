package sheridan;
import java.util.Arrays;//to use tostring method
public class Array101
{
    public static void main(String args[])
    {
        //declaration and inisialization of variabble
        int[] numBox = new int[5];
        numBox[0]=56;
        numBox[1]=78;
        numBox[2]=33;
        numBox[3]=100;
        numBox[4]=-3;
        
        //prints the element of array using tostring method
        System.out.println("Elements of numBox:"+Arrays.toString(numBox));
        
        //make a copy of  numBox
        int[] copyNumBox=Arrays.copyOf(numBox,numBox.length);
        
        //sort the array using sort()method
        Arrays.sort(copyNumBox);
        
        //prints the elements of array after sorting
        System.out.println("Elements of sorted numBox:"+Arrays.toString(copyNumBox));
        
        //resize numBox to 10 element
        //call resized array bigNumBox
        int[] bigNumBox=Arrays.copyOf(numBox,10);
        
        //print the element of resized numBox
        System.out.println("Element of bigNumBox"+Arrays.toString(bigNumBox));
        
    }//end of main method
}//end of clsss
