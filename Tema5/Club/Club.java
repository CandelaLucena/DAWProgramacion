import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club{
    // Define any necessary fields here ...
    private ArrayList<Membership> members;
    
    /**
     * Constructor for objects of class Club
     */
    public Club(){
        // Initialise any fields here ...
        members = new ArrayList<Membership>();
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member){
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers(){
        int tamaño = 0;
        tamaño = members.size();
        return tamaño;
    }

    /** 
     * Determinar el número de miembros que se han unido en
     * el mes indicado
     * @param month El mes que nos interesa
     * @return El número de miembros que se han unido ese mes
     */
    public int joinedInMonth(int month){
        int resultado = 0;

        if(month > 1 && month < 12) {
            for (Membership item : members) {
                if(item.getMonth() == month){
                    resultado++;
                }
            }
            return resultado;
        }else{
            System.out.println("Error");
            return resultado;
        }
    }

    public int purge(int month){
        int resultado = 0;
        Iterator<Membership> iter = members.iterator();
        while(iter.hasNext()){
            Membership item = iter.next();
            if(item.getMonth() == month){
                iter.remove();
                resultado++;
            }
        }
        return resultado;
    }
}
