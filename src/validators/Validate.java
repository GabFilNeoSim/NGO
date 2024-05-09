package validators;

import java.util.StringJoiner;
import javax.swing.JTextField;

public class Validate {
    
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
    
    public static boolean validateToInt(String data) {
        try {
            Integer.valueOf(data);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
    
    public static String validateFieldsToInt(JTextField ...fields) {
        StringBuilder builder = new StringBuilder();
        StringJoiner joiner = new StringJoiner(", ");
        builder.append("Följande värden måste vara heltal: ");
        
        // Kolla om fält är tomt, skippa den, annars kolla om det är en int, isåfall joina i strängen.
        for (JTextField field : fields) {
            if (field.getText().equals("")) {
                continue;
            } 
            if(!validateToInt(field.getText())){
                joiner.add(field.getText());
            }
        }
        
        builder.append(joiner.toString());
        String error = "";
        
        // Kolla om det är några fel, isåfall sätt strängen med buildern..
        if (joiner.length() > 0) {
            error = builder.toString();
        }
        
       return error;
    } 
}
