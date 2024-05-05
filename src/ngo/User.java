
package ngo;

import helpers.SQL;
import java.util.HashMap;
import oru.inf.InfException;

public class User {

    private String aid;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String avdelning;
    
    public User(String email) {
        this.email = email;
        init();
    }
    
    private void init() {
        String query = "SELECT aid, fornamn, efternamn, losenord, avdelning FROM anstalld WHERE epost = '%s'".formatted(email);
        
        SQL sql = SQL.getInstance();
        
        try {
            HashMap<String, String> result = sql.fetchRow(query);
            this.aid = result.get("aid");
            this.firstName = result.get("fornamn");
            this.lastName = result.get("efternamn");
            this.password = result.get("losenord");
            this.avdelning = result.get("avdelning"); 
            
        } catch (InfException ignored) {}
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

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAvdelning() {
        return avdelning;
    }
}
