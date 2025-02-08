import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest{

    private static final String FILE_PATH = "./Resources/testData.csv";

    @ParameterizedTest
    @CsvFileSource(resources = FILE_PATH)
    @DisplayName("merge Alternately tests")
     public void mergeAlternatelyTest(String word1, String word2, String expectedString) {
        Solution solution = new Solution();

        String actualResult = solution.mergeAlternately(word1, word2);

        boolean result = actualResult.equals(expectedString);

        assertTrue(result);
    }
}