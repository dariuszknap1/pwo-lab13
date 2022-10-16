package pwo.lab13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class TextTest {

    @ParameterizedTest
    @ValueSource(strings = {"aa234bb34sd", "1 2 3 4 5", "xx12x12x1x"})
    void cont5DigTest1(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(Text.cont5Dig(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd", "1 2 x 4 5", "xx1x12x1x"})
    void cont5DigTest2(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.cont5Dig(str));
    }

    @ParameterizedTest
    @CsvSource({"aabb3sd, 1", "1 2, 2", "xx12x1xx, 3"})
    void getDigitCountShouldReturnTrue(String str, int value) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(Text.getDigitCount(str) == value);
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd", "1 2 x 4 5", "xx1x12x1x"})
    void getDigitCountShouldReturnFalse(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.getDigitCount(str) == 5);
    }

    @ParameterizedTest
    @CsvSource({"aabbsd", " a  _", "xxOOxIxx"})
    void doesNotContainDigitsShouldReturnTrue(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(Text.doesNotContainDigits(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd", "1 2 x 4 5", "xx1x12x1x"})
    void doesNotContainDigitsShouldReturnFalse(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.doesNotContainDigits(str));
    }

    @ParameterizedTest
    @CsvSource({"12323", "1", "134342345"})
    void ContainsOnlyDigitsShouldReturnTrue(String str) {
        System.out.println("Test pozytywny dla: " + str);
        assertTrue(Text.containsOnlyDigits(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aa23bb34sd", "1 2 x 4 5", "  "})
    void ContainsOnlyDigitsShouldReturnFalse(String str) {
        System.out.println("Test negatywny dla: " + str);
        assertFalse(Text.containsOnlyDigits(str));
    }
}
