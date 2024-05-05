package helpers;

import java.util.ArrayList;
import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;
import static shared.Shared.*;

public class SQL {
    
    private static SQL instance;
    private static InfDB db;
    
    private SQL() {
        try {
            db = new InfDB(DB_NAME, DB_PORT, DB_USER, DB_PASS);
        } catch (InfException ignored) {}
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
    
    public String fetchSingle(String query) throws InfException {
        return db.fetchSingle(query);
    }

    public ArrayList<String> fetchColumn(String query) throws InfException {
       return db.fetchColumn(query);
    }

    public HashMap<String, String> fetchRow(String query) throws InfException {
        return db.fetchRow(query);
    }

    public ArrayList<HashMap<String, String>> fetchRows(String query) throws InfException {
       return db.fetchRows(query);
    }

    public String getAutoIncrement(String table, String attribute) throws InfException {
        return db.getAutoIncrement(table, attribute);
    }

    public void insert(String query) throws InfException {
        db.insert(query);
    }

    public void delete(String query) throws InfException {
        db.delete(query);
    }

    public void update(String query) throws InfException {
        db.update(query);
    }
}
