package com.leal.bruno.nos.test;

import com.leal.bruno.nos.test.pages.LoginPage;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LoginPageTest {

    @Test
    void testLoginWithValidCredentials() {
        LoginPage loginPage = new LoginPage();
        assertEquals(loginPage.login("admin", "admin"), Map.of(200, "Success"));
    }

    @Test
    void testLoginWithInvalidCredentials() {
        LoginPage loginPage = new LoginPage();
        assertEquals(loginPage.login("invalid", "credentials"), Map.of(400, "Invalid Credentials"));
    }

}
