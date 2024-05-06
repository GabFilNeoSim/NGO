package ngo;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkIJTheme;
import gui.LoginFrame;
import helpers.SQL;
import javax.swing.JOptionPane;
import oru.inf.InfException;

public class Main {
    
    public static void main(String[] args) {
        
        FlatAtomOneDarkIJTheme.setup();
        
        InfException exception = SQL.getInstance().getException();
        
        if (exception != null) {
            JOptionPane.showMessageDialog(null, exception.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            new LoginFrame().setVisible(true);
        } 
    }
}
