/*Database.java is program that insert and print database array
 *Author:ARK PATEL
*/ 
package sheridan;
import java.util.Arrays;//for using arrays 
//declaration of class
public class Database
{
   String table[];
   //parameterized constructor
   public Database(int size)
   {
       table=new String[size];
   }
   //method to sort array
   public void sort()
   {
       Arrays.sort(table); 
   }//end of method sort
   //method for inserting item
   public void insert(String item,int index)
   {
     table[index]=item;
   }//end of method insert
   //method to print array
   public void print()
   {
      //repeat array index
      for(int index=0; index < table.length; index++) 
      {
          System.out.println(table[index]);
      }
   }//end of method print
}//end of class