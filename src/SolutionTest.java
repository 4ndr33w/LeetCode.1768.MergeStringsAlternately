import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "abc, pqr, apbqcr",
            "ab, pqrs, apbqrs",
            "abcd, pq, apbqcd"
    })
    @DisplayName("mergeAlternately")
     public void mergeAlternatelyTest(String word1, String word2, String expectedString) {
        Solution solution = new Solution();

        String actualResult = solution.mergeAlternately(word1, word2);
        assertEquals(expectedString, actualResult);
    }
}