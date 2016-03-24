
/**
 * Write a description of class LoudDog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LoudDog extends Dog
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class LoudDog
     */
    public LoudDog(String name)
    {
        // initialise instance variables
        super(name);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String allSpeak()
    {
        // put your code here
        String ans=super.speak() +super.speak(); 
        return ans;
    }
}
