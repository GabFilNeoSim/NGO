package managers;

import java.util.ArrayList;
import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;
import utils.MySQL;
import utils.Role;

public class EmployeeManager {
    
    private static final InfDB db = MySQL.getInstance().getDB();
    
    private EmployeeManager() {}
    
    public static Role getRoleByAid(String aid) {
        String query = """
                       SELECT
                          CASE
                              WHEN admin.aid IS NOT NULL THEN 'admin'
                              WHEN handlaggare.aid IS NOT NULL THEN 'manager'
                              ELSE 'employee'
                          END AS Role
                       FROM anstalld
                       LEFT JOIN admin ON anstalld.aid = admin.aid
                       LEFT JOIN handlaggare ON anstalld.aid = handlaggare.aid
                       WHERE anstalld.aid = %s;
                       """.formatted(aid);
        
        try {
            
            String result = db.fetchSingle(query);
            
            switch (result) {
                case "admin":
                    return Role.Admin;
                case "handlaggare":
                    return Role.Manager;
                default:
                    return Role.Employee;
            }
            
        } catch (InfException ignored) {
            return null;
        }
    }
    
    public static HashMap<String, String> getEmployeeByEmail(String email) {
        
        String query = "SELECT * from anstalld where epost = '%s'".formatted(email);
        
        try {
            return db.fetchRow(query);
        } catch (InfException ignored) {
            return null;
        }
    }
    
    public static HashMap<String, String> getEmployeeByAid(String aid) {
        
        String query = "SELECT * from anstalld where aid = %s".formatted(aid);
        
        try {
            return db.fetchRow(query);
        } catch (InfException ignored) {
            return null;
        }
    }
    
    public static ArrayList<HashMap<String, String>> getEmployeesByAid(String aid) {
        
        String query = "SELECT * from anstalld where aid = %s".formatted(aid);
        
        try {
            return db.fetchRows(query);
        } catch (InfException ignored) {
            return null;
        }
    }
    
    public static HashMap<String, String> getManagerByAid(String aid) {
        
        String query = "SELECT * from manager where aid = %s".formatted(aid);
        
        try {
            return db.fetchRow(query);
        } catch (InfException ignored) {
            return null;
        }
    }
    
    public static HashMap<String, String> getAdminByAid(String aid) {
        
        String query = "SELECT * from admin where aid = %s".formatted(aid);
        
        try {
            return db.fetchRow(query);
        } catch (InfException ignored) {
            return null;
        } 
    }
    
    public static HashMap<String, String> getAllEmployeeInformationByAid(String aid) {
        String query = """
                       SELECT anstalld.*,  ansvarighetsomrade, mentor, behorighetsniva
                       FROM anstalld
                       LEFT JOIN handlaggare ON anstalld.aid = handlaggare.aid
                       LEFT JOIN admin ON anstalld.aid = admin.aid
                       WHERE anstalld.aid = %s;
                       """.formatted(aid);
  
        try {
            return db.fetchRow(query);
            
        } catch (InfException ignored) {
            return null;
        }
    }
    
    public static boolean updateEmployee(String query) {
        
        try {
            db.update(query);
            return true;
            
        } catch (InfException ignored) {
            return false;
        }
    }
}
