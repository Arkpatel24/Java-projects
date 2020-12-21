import java.io.*;
import java.util.Scanner;

public class calculator
{
    public static void main(String[] args)
    {
        double num1,num2;
        
        Scanner scan=new Scanner(System.in);
       
           
            System.out.println("enter first number:");
            num1=scan.nextDouble();
            System.out.println("enter second number:");
            num2=scan.nextDouble();
            
            
            System.out.println("SELECT YOUR CHOICE");
            System.out.println("1.ADDITION");
            System.out.println("2.SUBTRACTION");
            System.out.println("3.MULTIPLICATION");
            System.out.println("4.DIVISION");
            
            int choice;
            System.out.println("Enter your choice: ");
            choice=scan.nextInt();
            Double output;
            
                 switch(choice)
                 {
                   case 1:output=num1+num2;
                          System.out.println("Addition :" + output);
                          break;
                          
                   case 2:output=num1-num2;
                          System.out.println("Subtraction :" + output);
                          break;
                          
                   case 3:output=num1*num2;
                          System.out.println("Multiplicaton :" + output);
                          break;
                          
                   case 4:output=num1/num2;
                          System.out.println("Division :" + output);
                          break;       
                          
                   default:
                     System.out.println("Wrong Choice !!!");
                     
                 }
    }
}