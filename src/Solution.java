public class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder builder = new StringBuilder();

        if(word1.length() < word2.length()) {
            for(int i = 0; i < word1.length(); i++) {
                builder.append(word1.charAt(i));
                builder.append(word2.charAt(i));
            }
            builder.append(word2.substring(word1.length()));
        }
        else {
            for(int i = 0; i < word2.length(); i++) {
                builder.append(word1.charAt(i));
                builder.append(word2.charAt(i));
            }
            builder.append(word1.substring(word2.length()));
        }
        return builder.toString();
    }
}