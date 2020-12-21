package sheridan;
import java.util.Random;
public class Horoscope
{
    private String[] _prediction=new String[10];
    private int _numOfPrediction;
    
    //add a string prediction to the end of the array
    public void addPrediction(String prediction)
    {
        this._prediction[this._numOfPrediction]=prediction;
        _numOfPrediction++;//update number of prediction
    }//end method addPrediction
    
    public void showPrediction()
    {
        Random rnd=new Random();
        int rndPredictionIndex;//represent index of random prediction
        
        //generate random prediction 0 to _numOfPrediction-1
        rndPredictionIndex=rnd.nextInt(this._numOfPrediction);
        
        System.out.println(this._prediction[rndPredictionIndex]);
        
    }
}//end of class