package me.vik.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    private final User user = new User("login", "test@test.com");

    @Test
    @DisplayName("Корректность полей login и email при создании c передачей параметров")
    void getUserTest() {
        User user = new User("login", "test@test.com");
        assertEquals("login", user.getLogin());
        assertEquals("test@test.com", user.getEmail());
    }

    @Test
    @DisplayName("Корректность полей login и email при создании без передачи параметров")
    void getTestUserTest() {
        User user2 = new User();
        assertEquals(null, user2.getLogin());
        assertEquals(null, user2.getEmail());
    }

    @Test
    @DisplayName("Наличие символв: (.) и (@), в email")
    void isCorrectEmailFormatTest() {
        assertTrue(user.getEmail().contains("."), ("@"));
    }

    @Test
    @DisplayName("Cравнение полей login и email (не равны)")
    void comparisonLoginAndEmailTest() {
        assertNotEquals(user.getLogin(), user.getEmail());
    }
}
