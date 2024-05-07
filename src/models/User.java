
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
    private String address;
    private String phone;
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
        String query = "SELECT * FROM anstalld WHERE epost = '%s'".formatted(email);
        
        try {
            HashMap<String, String> result = db.fetchRow(query);
            this.aid = result.get("aid");
            this.firstName = result.get("fornamn");
            this.lastName = result.get("efternamn");
            this.avdelning = result.get("avdelning");
            this.address = result.get("adress");
            this.phone = result.get("telefon");
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
    
    public String getAddress() {
        return address;
    }
    
    public String getPhone() {
        return phone;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        updateRow("fornamn", firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        updateRow("efternamn", lastName);
    }

    public void setEmail(String email) {
        this.email = email;
        updateRow("epost", email);
    }

    public void setAddress(String address) {
        this.address = address;
        updateRow("adress", address);
    }

    public void setPhone(String phone) {
        this.phone = phone;
        updateRow("telefon", phone);
    }

    public void setPassword(String password) {
        this.password = password;
        //SQL
    }
    
    private void updateRow(String column, String value) {
        String query = "UPDATE anstalld SET %s = '%s' WHERE aid = '%s'".formatted(column, value, aid);
       
        try {
            db.update(query);
        } catch (InfException ignored) { }
    }
    
    @Override
    public String toString() {
        return getFullName();
    }
}
