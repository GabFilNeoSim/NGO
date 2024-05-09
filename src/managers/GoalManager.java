package managers;

import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;
import utils.MySQL;

public class GoalManager {  
    
    private static final InfDB db = MySQL.getInstance().getDB();

    private GoalManager(){}

    public static HashMap<String, String> getGoalsInformation(String hid) {
        
        String query = "SELECT malnummer, beskrivning, prioritet FROM hallbarhetsmal WHERE hid = %s".formatted(hid);
        
        try {
            return db.fetchRow(query);
        } catch (InfException ignored) {
            return null;
        }
    }
}
