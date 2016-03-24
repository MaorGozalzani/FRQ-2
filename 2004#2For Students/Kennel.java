import java.util.ArrayList;

public class Kennel
{
    private ArrayList<Pet> petList;

    public Kennel()
    {
        petList = new ArrayList<Pet>();
    }
    public void add(Pet fido)
    {
        petList.add(fido);
    }
    // postcondition:   for each Pet in the kennel, its name followed
    //                  by the result of a call to its speak method
    //                  has been printed, one line per Pet
    public void allSpeak()
    {
        // to be implemented in part c
    }
}
