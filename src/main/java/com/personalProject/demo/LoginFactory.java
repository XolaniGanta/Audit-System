package com.personalProject.demo;

import com.personalProject.demo.Entity.Login;

public class LoginFactory
{
    public static Login createLogin(String emailAddress, String password)
    {
        String loginID = GenerateID.generateID();
        return new Login.Builder()
                .setLoginID(loginID)
                .setEmailAddress(emailAddress)
                .setPassword(password)
                .build();
    }
}