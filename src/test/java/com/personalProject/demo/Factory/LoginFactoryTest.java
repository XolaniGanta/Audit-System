package com.personalProject.demo.Factory;

import com.personalProject.demo.Entity.Login;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class LoginFactoryTest
{

    public static Login login = LoginFactory
            .createLogin("xolaniganta@gmail.com", "forthelulz123");

    @Test
    public void createLogin()
    {
        assertNotNull(login.getLoginID());
    }
}