
package models;

import helpers.SQL;
import java.util.HashMap;
import oru.inf.InfDB;
import oru.inf.InfException;

public class User {
    
    private final InfDB db;

    private String aid;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String avdelning;
    private Role role;
    
    public User(String email, String password) {
        db = SQL.getInstance().getDB();
        this.email = email;
        this.password = password;
        init();
    }
    
    private void init() {
        String query = "SELECT aid, fornamn, efternamn, avdelning FROM anstalld WHERE epost = '%s'".formatted(email);
        
        try {
            HashMap<String, String> result = db.fetchRow(query);
            this.aid = result.get("aid");
            this.firstName = result.get("fornamn");
            this.lastName = result.get("efternamn");
            this.avdelning = result.get("avdelning"); 
            role = fetchRole();
            
        } catch (InfException ignored) {}
    }
    
    private Role fetchRole() {
        try {
            // Kolla admin
            String adminQuery = "SELECT aid FROM admin WHERE aid = '%s'".formatted(aid);
            if (db.fetchSingle(adminQuery) != null) {
                return Role.Admin;
            }
            
            // Kolla handläggare
            String managerQuery = "SELECT aid FROM handlaggare WHERE aid = '%s'".formatted(aid);
            if (db.fetchSingle(managerQuery) != null) {
                return Role.Manager;
            }

        } catch (InfException ignored) {}
        
        return Role.Employee;
    }

    public String getAid() {
        return aid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
      
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAvdelning() {
        return avdelning;
    }
    
    public Role getRole() {
        return role;
    }
}
