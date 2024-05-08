package helpers;

import java.security.SecureRandom;
import java.util.Random;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;

public class Helper {
    
    public static String generatePassword(int length) {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        
        Random random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int charIndex = random.nextInt(chars.length());
            password.append(chars.charAt(charIndex));
        }

        return password.toString();
    }
    
    public static boolean hasChanged(String oldValue, String newValue) {
        return !oldValue.equals(newValue);
    }
    
    public static boolean checkIfAnyValueIsEmpty(String ...values) {
        for (String value : values) {
            if (value.isBlank()) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean checkIfAnyFieldIsEmpty(JTextField ...fields) {
        for (JTextField field : fields) {
            if (field.getText().isBlank()) {
                return true;
            }
        }
        return false;
    }
    
    public static void clearTextFields(JTextField ...fields) {
        for (JTextField field : fields) {
            field.setText("");
        }
    }
    
    public static String changeToEmptyStringIfNull(String value) {
        if (value == null) {
            return "";
        } else {
            return value;
        }
    }
    
    public static void updateListEntry(JList list, DefaultListModel<String> model, String newEntry) {
        int selectedIndex = list.getSelectedIndex();
        if (selectedIndex != -1) {
            model.setElementAt(newEntry, selectedIndex);
        }
    }
    
    public static void removeListEntry(JList list, DefaultListModel<String> model) {
        int selectedIndex = list.getSelectedIndex();
        if (selectedIndex != -1) {
            model.remove(selectedIndex);
        }
    }
}
