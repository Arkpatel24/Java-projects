package sheridan;

public class TernaryDemo
{
    public static void main(String args[])
    {
        int userGuess=5;
        int gameGuess=5;
        //check if the two guesses are equal
        String result=(userGuess==gameGuess)?"This is correct":"This is incorrect";
        System.out.println(result);
    }//end of main method
}//end of class