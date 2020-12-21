/*Ch5Ex18P4.java is simple program that prints pattern 
 * Author:ARK PATEL
*/
package sheridan;
//declaration of class ch5Ex18P4
public class Ch5Ex18P4
{
    public static void main(String args[])
    {
        //declaration and inisialization of variables
        int row , column;
        System.out.println("Pattern D");
        //repeat row and column
        for(row=6;row>=1;row--)
        {
            for(column=6-row;column>=1;column--)
            {
                System.out.print(" ");
            }
            for(column=1;column<=row;column++)
            {
                System.out.print(column);
            }
            System.out.println();
        }
    }//end of main method
}//end of class Ch5Ex18P4
