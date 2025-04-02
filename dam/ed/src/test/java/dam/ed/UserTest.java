package dam.ed;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testValidUserCreation() {
        User user = new User("Alice", 30);
        assertEquals("Alice", user.getName());
        assertEquals(30, user.getAge());
    }

    @Test
    void testInvalidUserCreation() {
        assertThrows(IllegalArgumentException.class, () -> new User("", 25));
        assertThrows(IllegalArgumentException.class, () -> new User("Bob", -5));
    }
}
