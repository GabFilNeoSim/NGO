package managers;

import helpers.SQL;
import java.util.ArrayList;
import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;

public class ProjectManager {
    
    private static final InfDB db = SQL.getInstance().getDB();
    
    private ProjectManager() {}
    
    public static ArrayList<HashMap<String,String>> getProjects() {
        
        String query = "SELECT * FROM projekt";
        
        try {
            return db.fetchRows(query);
            
        } catch (InfException ignored) {
            return null;
        }
    }
    
    public static HashMap<String,String> getProjectByPid(String pid) {
        
        String query = "SELECT * FROM projekt WHERE pid = %s".formatted(pid);
        
        try {
            return db.fetchRow(query);
            
        } catch (InfException ignored) {
            return null;
        }
    }
    
    public static HashMap<String,String> addProject(String pid, String name) {
        
        String query = "SELECT * FROM projekt WHERE pid = %s".formatted(pid);
        
        try {
            return db.fetchRow(query);
            
        } catch (InfException ignored) {
            return null;
        }
    }
}

