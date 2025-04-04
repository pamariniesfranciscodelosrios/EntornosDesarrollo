package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void testReverse() {
        assertEquals("asaC", StringUtils.reverse("Casa"));
        assertEquals("", StringUtils.reverse(""));
        assertNull(StringUtils.reverse(null));
    }

    @Test
    void testCountChars() {
        assertEquals(7, StringUtils.countChars("Antonio"));
        assertEquals(0, StringUtils.countChars(""));
        assertEquals(0, StringUtils.countChars(null));
    }
}