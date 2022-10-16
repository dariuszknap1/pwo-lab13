package pwo.lab13;

public class Text {

    static boolean cont5Dig(String str) {
        return str.replaceAll("[^0-9]", "").length() == 5;
    }
    static int getDigitCount(String str){
        return str.replaceAll("[^0-9]", "").length();
    }
    
    static boolean doesNotContainDigits(String str){
        return str.replaceAll("[^0-9]", "").length() == 0;
    }
    
        static boolean containsOnlyDigits(String str){
        return str.replaceAll("[^0-9]", "").length() == str.length();
    }
}
