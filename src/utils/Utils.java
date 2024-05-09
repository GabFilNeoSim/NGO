package utils;

import java.security.SecureRandom;
import java.util.Random;

public class Utils {
    
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
    
    public static String changeToEmptyStringIfNull(String value) {
        if (value == null) {
            return "";
        } else {
            return value;
        }
    }
}
