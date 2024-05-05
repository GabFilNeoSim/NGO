package shared;

import ngo.User;

public class Shared {
    
    private Shared() {}
       
    // MySQL database
    public static final String DB_NAME = "ngo_2024";
    public static final String DB_PORT = "3306";
    public static final String DB_USER = "dbAdmin2024";
    public static final String DB_PASS = "dbAdmin2024PW";
    
    // User
    public static User CURRENT_USER;
}
