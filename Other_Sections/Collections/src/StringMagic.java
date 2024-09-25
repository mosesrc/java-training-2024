import java.util.Arrays;

public class StringMagic {
    public boolean areAnagrams(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) return false;

        char[] charArr1 = str1.toLowerCase().toCharArray();
        char[] charArr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        return Arrays.equals(charArr1, charArr2);
    }

    public String reverseWordsInSentence(String sentence) {
        // TODO: Check if the sentence is null.
        if (sentence == null) return "INVALID";

        // TODO: Check if the sentence is empty.
        if (sentence.isEmpty()) return "";

        // TODO: Split the sentence into words using the split method.
        String[] words = sentence.split(" ");

        // TODO: Create a StringBuilder to hold the reversed sentence.
        StringBuilder str = new StringBuilder();

        // TODO: Loop through each word in the words array.
        // TODO: For each word, create a StringBuilder and reverse the word.
        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder(words[i]);
            str.append(word.reverse());
            str.append(" ");
        }

        // TODO: After reversing all the words, trim the trailing space and return the reversed sentence.
        return str.toString().trim();
    }
}
