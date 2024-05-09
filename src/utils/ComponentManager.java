package utils;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;

public class ComponentManager {
    
    public static void clearTextFields(JTextField ...fields) {
        for (JTextField field : fields) {
            field.setText("");
        }
    }
    
    public static <T> void updateListEntry(JList list, DefaultListModel<T> model, T newEntry) {
    int selectedIndex = list.getSelectedIndex();
    if (selectedIndex != -1) {
        model.setElementAt(newEntry, selectedIndex);
    }
}
    
    public static <T> void removeListEntry(JList list, DefaultListModel<T> model) {
        int selectedIndex = list.getSelectedIndex();
        if (selectedIndex != -1) {
            model.remove(selectedIndex);
        } 
    }
}
