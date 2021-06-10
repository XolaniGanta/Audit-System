package com.personalProject.demo.Factory;

import com.personalProject.demo.Entity.Login;
import com.personalProject.demo.Util.GenerateID;

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