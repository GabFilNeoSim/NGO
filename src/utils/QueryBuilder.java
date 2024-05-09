package utils;

import validators.Validate;
import java.util.HashMap;
import java.util.StringJoiner;

public class QueryBuilder {
    
    public static String updateQuery(HashMap<String,String> dbEmployee, HashMap<String,String> newEmployee, String table, String condition) {
        StringBuilder builder = new StringBuilder();
        StringJoiner joiner = new StringJoiner(", ");
        builder.append("UPDATE %s SET ".formatted(table));
        
        for (String key : newEmployee.keySet()) {
            String oldValue = dbEmployee.get(key);
            String newValue = newEmployee.get(key);
            
            if (Validate.hasChanged(oldValue, newValue)) {
                try {
                     Double.valueOf(newValue);
                     joiner.add("%s = %s".formatted(key, newValue));
                 } catch (NumberFormatException e) {
                     joiner.add("%s = '%s'".formatted(key, newValue));
                 }
            }
        }
        
        builder.append(joiner.toString());
        builder.append(" WHERE %s".formatted(condition));

        if (joiner.length() <= 0) {
            return "";
        }
        return builder.toString();
    }
    
    public static HashMap<String, String> updateMap(HashMap<String, String> map, KeyValue... pairs) {
        for (KeyValue pair : pairs) {
            map.put(pair.getKey(), pair.getValue());
        }
        return map;
    }
    
    
}
