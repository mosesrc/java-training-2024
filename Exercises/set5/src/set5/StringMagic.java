package set5;

public class StringMagic {

    public int countUppercaseLetters(String str) {
        if (str.isEmpty()) return 0;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    public boolean hasConsecutiveDuplicates(String str) {
        if (str.isEmpty() || str.length() == 1) return false;

        for (int i = 0; i < str.length() - 1; i++) {
            char next = str.charAt(i + 1);
            if (str.charAt(i) == next) {
                return true;
            }
        }

        return false;
    }

    public int getRightMostDigit(String str) {
        if (str.isEmpty()) return -1;

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if(Character.isDigit(c)) return Character.getNumericValue(c);
        }

        return -1;
    }

}
