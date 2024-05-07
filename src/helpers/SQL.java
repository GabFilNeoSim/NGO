package helpers;

import java.util.ArrayList;
import java.util.HashMap;
import models.Role;
import oru.inf.InfDB;
import oru.inf.InfException;

public class SQL {
    
    private static final String DB_NAME = "ngo_2024";
    private static final String DB_PORT = "3306";
    private static final String DB_USER = "dbAdmin2024";
    private static final String DB_PASS = "dbAdmin2024PW";
    
    private static SQL instance;
    private static InfDB db;
    private static InfException exception;
    
    private SQL() {
        try {
            db = new InfDB(DB_NAME, DB_PORT, DB_USER, DB_PASS);
        } catch (InfException e) {
            exception = e;
        }
    }
    
    public static SQL getInstance() {
        if (instance == null) {
            instance = new SQL();
        }

        return instance;
    }
    
    public InfDB getDB() {
        return db;
    }
    
    public InfException getException() {
        return exception;
    }
    
    // --- Custom methods ---
    
    public HashMap<String, String> getEmployeeByAid(String aid) {
        
        String query = "SELECT * from anstalld where aid = %s".formatted(aid);
        
        try {
            return db.fetchRow(query);
        } catch (InfException ignored) {}
        
        return null;
    }
    
    public ArrayList<HashMap<String, String>> getEmployeesByAid(String aid) {
        
        String query = "SELECT * from anstalld where aid = %s".formatted(aid);
        
        try {
            return db.fetchRows(query);
        } catch (InfException ignored) {}
        
        return null;
    }
}
