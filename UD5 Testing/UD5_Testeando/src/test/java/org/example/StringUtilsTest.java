package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testReverse() {
        assertEquals("olleH", StringUtils.reverse("Hello"));
        assertEquals("", StringUtils.reverse(""));
        assertNull(StringUtils.reverse(null));
    }

    @Test
    void testCountChars() {
        assertEquals(5, StringUtils.countChars("Hello"));
        assertEquals(0, StringUtils.countChars(""));
        assertEquals(0, StringUtils.countChars(null));
    }
}