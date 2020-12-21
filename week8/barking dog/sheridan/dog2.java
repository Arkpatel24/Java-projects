/*dog2.java is program that show if a dog weight is more than  30 is big dog otherwise small
 * Author:ARK PATEL
*/
package sheridan;
//declaration of class dog2
public class dog2
{
    private int _weight;//declaration of field variable
    //declaration of method setWeight
    public void setWeight(int weight)
    {
        _weight = weight;
    }
    //declaration of method bark
    public void bark()
    {    
        //condition that check weight
        if(_weight>=30)
        {
            System.out.println("Woof! Woof!");//represent big dog bark
        }
        else
        {
            System.out.println("Yiif! Yiif!");//represent small dog bark
        }
    }
    //declaration of main method 
    public static void main(String args[])
    {
        //declaration and inisialization 
        dog2 one = new dog2();
        one.setWeight(35);
        dog2 two = new dog2();
        two.setWeight(15);
        //invoking method
        one.bark();
        two.bark();
    }
}