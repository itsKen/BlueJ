/**
 * Implement a class RoachPopulation that simulates the growth of a roach population. 
 * 
 * @author (Kenneth Nguyen) 
 * @version (10/4/2016)
 */
public class RoachPopulation
{   
    public double population;   //Current population of roaches
    
    /**
     * Constructs size of the initial population of roaches
     * @param population current population of roaches 
     */
    public RoachPopulation(double population)
    {
        this.population = population;
    }
    
    /**
     * Doubles the current population 
     */
    public void breed()
    {
        population = population * 2;
    }
    
    /**
     * Increases the population by the specified ratio(multiplier)
     */
    public void labBreed(double multiplier)
    {
        population = population + population*multiplier;  
    }
    
    /**
     * Reduces the current population by 10%
     */
    public void spray()
    {
        population = population * 0.9;
    }
    
    /**
     * Decimates the roach population, leaving it at 0
     */
    public void wipeOut()
    {
        population = 0;
    }
    
    /**
     * Return the final roach population
     */
    public double getRoaches()
    {
        return population;
    }
}

