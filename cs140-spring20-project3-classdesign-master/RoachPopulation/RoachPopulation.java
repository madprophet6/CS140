
/**
 * Write a description of class RoachPopulation here.
 *
 * @author (Dahwal Charles)
 * @version (3/1/20)
 */
public class RoachPopulation
{
    private int numRoaches;
    double population = 0;
    /**
     * Constructs the population of roaches.
     * 
     */
    public RoachPopulation (int amtRoaches)
    {
        numRoaches = amtRoaches;
    }
    
    /**
     * Spray the population reducing the population by 10%.
     */
     public void spray(double percent){
        double sizePercent = population/ .9;
        population = population - sizePercent;
    }
    
    /**
     * Breeding,doubling their population.
     */
    public void breed ()
    {
        numRoaches =numRoaches * 2;
    }
    
    /**
     * 
     * return The population of roaches.
     */
    public int getRoaches ()
    {
        return ((int) numRoaches);
    }
    
    /**
     * 
     * 
     */
    public String toString()
    {
        return "Number of roaches in the population: " + numRoaches;
    }
}
