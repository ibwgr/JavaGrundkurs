package ch.ibw.java;

import java.io.OutputStream;
import java.util.Locale;

public class CharToUpper {
    public static void main(String[] args) {
        String string = "abcdefg";
        String output = "";
        System.out.println(string);
        System.out.println(string.length());
        char[] character = new char[string.length()];
        for(int i = 0; i < string.length(); i++){
            character[i] = string.charAt(i);
            String a = "";
            if((i+1)%2==0){
                a = String.valueOf(character[i]).toUpperCase(Locale.ROOT);
            } else {
                a = String.valueOf(character[i]).toLowerCase(Locale.ROOT);
            }
            output += a;

        }
        System.out.println(output);
    }
}
