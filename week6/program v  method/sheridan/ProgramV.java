package sheridan;
public class ProgramV
{
    // The mathematical constant Pi 
    // Note: 'static' is needed here to use it from main method
    private double pi;
    public static void main(String[] args)
    {   
        //declaration and inisialization
        ProgramV self=new ProgramV();
        
        //invoke the two mwthod
        self.helloone();
     
    }//end of the main method
    
    public void helloone()
    {
        // This writes a message to the screen
        System.out.println ( "Hello Pi Program" );
        pi = 355.0 / 113.0;  
        System.out.println ( "Pi is about " + pi );
        
        hellotwo();
    }//end of helloone
    public void hellotwo()
    {
        // How much to multiply by (this is a local variable)
        double multiplier = 2;  
        double twoPi = multiplier * pi; 
        System.out.println ( "Two Pi is about " + twoPi );
    }//end of hellotwo
} //end of class

