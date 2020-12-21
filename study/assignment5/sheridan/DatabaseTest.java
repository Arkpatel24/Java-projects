package sheridan;
import java.util.Scanner;//scan input
//declaration of class
public class DatabaseTest
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        try
        { 
            //input
            System.out.println("Enter the table size:");
            int userSize=input.nextInt();
            input.nextLine();
            Database self=new Database(userSize);
            //repeat the loop
            for(int index=0;index<userSize;index++)
            {
                System.out.println("Enter the item");
                String item=input.nextLine();
                self.insert(item,index);
            }
            self.print();
            self.sort();
            System.out.println("Sorted Array is");
            self.print();
        }
        catch (Exception e)
        {
            System.out.println("Bad input!!!");
        }
    }//end of main method
}//end of class