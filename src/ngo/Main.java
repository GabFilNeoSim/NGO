package ngo;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;
import gui.LoginFrame;
import oru.inf.InfDB;
import oru.inf.InfException;
import static shared.Shared.*;

public class Main {
    
    private static InfDB db;
    
    public static void main(String[] args) {
        
        FlatAtomOneDarkIJTheme.setup();
        
        try {
            db = new InfDB(DB_NAME, DB_PORT, DB_USER, DB_PASS);
            new LoginFrame(db).setVisible(true);
            
        } catch (InfException e) {
            System.out.println(e.getMessage());
        }
    }
}
