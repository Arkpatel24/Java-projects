package sheridan;

public class ifdemo
{
    public static void main(String[] args)
    {
        //declaration and inisialization
        int grade=97;
        
        if(grade>=80)
        {
            System.out.println("You got an A");
        }
        else
        {
            System.out.println("You got B or less");
        }
        System.out.println("This line runs no matter what");
    }
}
    