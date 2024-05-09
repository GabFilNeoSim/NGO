package utils;

import oru.inf.InfDB;
import oru.inf.InfException;

public class MySQL {
    
    private static final String DB_NAME = "ngo_2024";
    private static final String DB_PORT = "3306";
    private static final String DB_USER = "dbAdmin2024";
    private static final String DB_PASS = "dbAdmin2024PW";
    
    private static MySQL instance;
    private static InfDB db;
    private static InfException exception;
    
    private MySQL() {
        try {
            db = new InfDB(DB_NAME, DB_PORT, DB_USER, DB_PASS);
        } catch (InfException e) {
            exception = e;
        }
    }
    
    public static MySQL getInstance() {
        if (instance == null) {
            instance = new MySQL();
        }

        return instance;
    }
    
    public InfDB getDB() {
        return db;
    }
    
    public InfException getException() {
        return exception;
    }
}