package sheridan;

public class Overloaded
{
    
        public int max(int num1,int num2)
        {
            return (num1>num2)?num1:num2;
        }
        public double max(double num1,double num2)
        {
            return (num1>num2)?num1:num2;
        }
        public int max(int num1,int num2,int num3)
        {
            return max(max(num1,num2),num3);
        }
        
        public static void main(String args[])
        {
            Overloaded self=new Overloaded();
            System.out.println("The bigger number between(5,7)is:"+self.max(5,7));
            System.out.println("The bigger number between(5.3,7.3)is:"+self.max(5.3,7.3));
            System.out.println("The bigger number between(5,7,9)is:"+self.max(5,7,9));
        }
}
    
    