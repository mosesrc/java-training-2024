public class MyString {
    public String str;

    public MyString(String str) {
        this.str = str;
    }

    public boolean isHexadecimalChar(char ch) {
        return (ch >= 'A' && ch <= 'F') || (ch >= 'a' && ch <= 'f');
    }

    public boolean isHexadecimal() {
        if (str == null || str.isEmpty() || str.length() == 1) return false;

        char[] chars = str.toCharArray();

        for( char ch : chars) {
            if(!Character.isDigit(ch) && !isHexadecimalChar(ch)) {
                return false;
            }
        }

        return true;
    }

}
