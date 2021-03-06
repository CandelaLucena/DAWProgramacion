
/**
 * Provide a demonstration of the Club and Membership
 * classes.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClubDemo
{
    // instance variables - replace the example below with your own
    private Club club;

    /**
     * Constructor for objects of class ClubDemo
     */
    public ClubDemo()
    {
        club = new Club();
    }

    /**
     * Add some members to the club, and then
     * show how many there are.
     * Further example calls could be added if more functionality
     * is added to the Club class.
     */
    public void demo()
    {
        club.join(new Membership("David", 13, 2004));
        club.join(new Membership("Michael", 1, 2004));
        System.out.println("The club has " +
                           club.numberOfMembers() +
                           " members.");
    }

    public static void main(String[] args) {
        ClubDemo cd = new ClubDemo();
        try{
            cd.demo();
        }
        catch(Exception error){
            System.out.println("Error");
            System.out.println(error.toString());
        }
          
        
    }
}
