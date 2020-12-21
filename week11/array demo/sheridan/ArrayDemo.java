package sheridan;
import java.util.Scanner;
public class ArrayDemo
{
    public static void main(String args[])
    {
        ArrayDemo self=new ArrayDemo();
        String[] nameList;
        int userSize;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many element you want: ");
        userSize=input.nextInt();
        
        nameList=new String[userSize];
        
        self.enterName(nameList);
    }
    
    public void enterName(String[] nameList)
    {
        Scanner input=new Scanner(System.in);
        for(int index=0;index<nameList.length;index++)
        {
            System.out.println("Enter nameList["+index+"]");
            nameList[index]=input.nextLine();
            System.out.println(nameList[index]);
        }
    }
}