//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        String word1 = "abc";
        String word2 = "pqr";
        Solution solution = new Solution();

        String actualResult = solution.mergeAlternately(word1, word2);

        System.out.println(actualResult);
    }
}