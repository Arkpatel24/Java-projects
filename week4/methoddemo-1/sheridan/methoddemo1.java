package sheridan;
//declaration of class
public class methoddemo1
{
    //printStars print one line of (5) stars
    public void printStars()  //method declaration or signature
    { 
        //print one line of 5 stars
        System.out.println("* * * * *");
    }//end of method printStars
    public void printChar(char symbol)//printChar prints the provided character 
    {
        //print the parameter
        System.out.println("Character requested is "+symbol);
    }//end of method printChar
    public static void main(String args[])
    {
        //declaration and initialization
        methoddemo1 self=new methoddemo1();
        //invoke printStars method
        self.printStars();
        self.printStars();
        self.printStars();
        self.printChar('a');
        self.printChar('@');
    }//end of main method
}//end of class