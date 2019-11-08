package FGObackEnd.services;

/**
 * This class handles any
 * alternative spellings of a servant name
 * or any nicknames
 */
public class EnhancedSearch {
    public String enhancedSearch(String name){
        if(name.toLowerCase().equals("arturia")){
            name = "Altria";
        }
        if(name.toLowerCase().equals("cu")){
            name = "Cú";
        }
        if(name.toLowerCase().equals("asvatthaman")){
            name = "Aśvatthāman";
        }
        if(name.toLowerCase().equals("jalter")){
            name = "Jeanne";
        }
        return name;
    }
}
