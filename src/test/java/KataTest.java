import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void evenOrOddShouldClassifyNumbers() {
        assertEquals("Even", Kata.evenOrOdd(2));
        assertEquals("Odd", Kata.evenOrOdd(7));
        assertEquals("Even", Kata.evenOrOdd(0));
    }

    @Test
    void getMiddleShouldReturnMiddleCharacters() {
        assertEquals("es", Kata.getMiddle("test"));
        assertEquals("t", Kata.getMiddle("testing"));
        assertEquals("dd", Kata.getMiddle("middle"));
    }

    @Test
    void oppositeShouldInvertSign() {
        assertEquals(-1, Kata.opposite(1));
        assertEquals(7, Kata.opposite(-7));
        assertEquals(0, Kata.opposite(0));
    }

    @Test
    void repeatStrShouldRepeatGivenTimes() {
        assertEquals("aaaaa", Kata.repeatStr(5, "a"));
        assertEquals("", Kata.repeatStr(0, "a"));
        assertEquals("", Kata.repeatStr(-3, "a"));
    }

    @Test
    void booleanToStringShouldConvertBoolean() {
        assertEquals("true", Kata.booleanToString(true));
        assertEquals("false", Kata.booleanToString(false));
    }
}
