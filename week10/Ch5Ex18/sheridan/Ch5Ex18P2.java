/*Ch5Ex18P2.java is simple program that prints pattern 
 * Author:ARK PATEL
*/
package sheridan;
//declaration of class ch5Ex18P2
public class Ch5Ex18P2
{
    public static void main(String args[])
    {
        //declaration and inisialization of variables
        int row , column;
        System.out.println("Pattern B");
        //repeat row and column
        for(row=6;row>=1;row--)
        {
            for(column=1;column<=row;column++)
            {
                System.out.print(column);
            }
            System.out.println();
        }
    }//end of main method
}//end of class Ch5Ex18P2
