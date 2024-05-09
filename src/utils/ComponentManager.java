package utils;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;
import models.EmployeeModel;

public class ComponentManager {
    
    public static void clearTextFields(JTextField ...fields) {
        for (JTextField field : fields) {
            field.setText("");
        }
    }
    
    public static void updateListEntry(JList list, DefaultListModel<String> model, String newEntry) {
        int selectedIndex = list.getSelectedIndex();
        if (selectedIndex != -1) {
            model.setElementAt(newEntry, selectedIndex);
        } 
    }
    
    public static void updateListEntry(JList list, DefaultListModel<String> model, EmployeeModel newEntry) {
        int selectedIndex = list.getSelectedIndex();
        if (selectedIndex != -1) {
            model.setElementAt(newEntry.toString(), selectedIndex);
        } 
    }
    
    public static void removeListEntry(JList list, DefaultListModel<String> model) {
        int selectedIndex = list.getSelectedIndex();
        if (selectedIndex != -1) {
            model.remove(selectedIndex);
        }
    }
}
