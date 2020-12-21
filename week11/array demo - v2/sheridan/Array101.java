package sheridan;
public class Array101
{
    public static final int ARRAY_SIZE=5;
    public static void main(String args[])
    {
        //declaration and inisialization of variabble
        int[] numBox ={56,78,33,100,-3};
    
        //prints the elements of array
        System.out.println("numBox.length:"+numBox.length);//print length of arrays
        for(int index=0;index<numBox.length;index++)
        {
        System.out.println("numBox["+index+"]="+numBox[index]);
        }
     /* System.out.println("numBox["+1+"]="+numBox[1]);
        System.out.println("numBox["+2+"]="+numBox[2]);
        System.out.println("numBox["+3+"]="+numBox[3]);
        System.out.println("numBox["+4+"]="+numBox[4]);*/
        
        //print element of array in reverse order
        for(int index=numBox.length-1;index>=0;index--)
        {
        System.out.println("numBox["+index+"]="+numBox[index]);
        }
    }//end of main method
}//end of clsss
