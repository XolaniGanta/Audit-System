package com.personalProject.demo.Factory;

import com.personalProject.demo.Entity.UserAccount;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class UserAccountFactoryTest {

    // a method used to store the current date within variable date
    LocalDate date = LocalDate.now();


    // this test is completed to make sure the UserID is never null
    @Test
    public void createUserAccountId(){
        try {
            UserAccount userAccount = UserAccountFactory.createUserAccount("XolaniGanta@gmail.com",
                    "12345678rR1@!", true, date);
            System.out.println(userAccount.getUserId());
            Assert.assertNotEquals(null, userAccount.getUserId());
        }catch(Exception e)
        {
            Assert.fail();
        }
    }

    // this test is completed to make sure the userEmail is never null
    @Test
    public void createUserAccountUserEmail() {
        try {
            UserAccount userAccount = UserAccountFactory.createUserAccount("XolaniGanta@gmail.com",
                    "12345678rR1@!", true, date);
            System.out.println(userAccount.getEmail());
            Assert.assertNotEquals(null, userAccount.getEmail());
        }catch(Exception e)
        {
            Assert.fail();
        }
    }
    // this test is completed to check if an invalid email will fail, which it does based on my hardcoded Object
    @Test
    public void invalidEmail() {
        try {
            UserAccount userAccount = UserAccountFactory.createUserAccount("XolaniGanta@gmail.com",
                    "12345678rR1@!", true, date);
            // if no exception is thrown then the test must fail
            Assert.fail();
        }catch (Exception e)
        {
            // exception has been thrown, validate that it returns the correct error message
            Assert.assertEquals("This email is not valid.", e.getMessage());
        }
    }


    // this test is completed to make sure the userPassword is never null
    @Test
    public void createUserAccountUserPassword() {
        try{
            UserAccount userAccount = UserAccountFactory.createUserAccount("XolaniGanta@gmail.com",
                    "12345678rR1@!",true,date);
            System.out.println(userAccount.getPassword());
            Assert.assertNotEquals(null, userAccount.getPassword());
        }catch(Exception e)
        {
            Assert.fail();
        }

    }
    // this test is completed to make sure the userLoginStatus is never null, it should either contain
    // a true or false value, depending on whether the user is logged in.
    @Test
    public void createUserAccountUserLoginStatus() {
        try {
            UserAccount userAccount = UserAccountFactory.createUserAccount("XolaniGanta@gmail.com",
                    "12345678rR1@!", true, date);
            System.out.println(userAccount.isLoginStatus());
            Assert.assertNotEquals(null, userAccount.isLoginStatus());
        }catch(Exception e)
        {
            Assert.fail();
        }

    }

    // 1.1 ) this test is completed to make sure the userDate can contain the current date
    @Test
    public void createUserAccountUserDateExist() {
        try {
            UserAccount userAccount = UserAccountFactory.createUserAccount("XolaniGanta@gmail.com",
                    "12345678rR1@!", true, date);
            System.out.println(userAccount.getRegisterDate());
            Assert.assertNotEquals(null, userAccount.getRegisterDate());
        }catch(Exception e)
        {
            Assert.fail();
        }
    }

    // 1.2 ) this test is completed to make sure the userDate can contain nothing too
    @Test
    public void createUserAccountUserDateNotExist() {
        try {
            UserAccount userAccount = UserAccountFactory.createUserAccount("XolaniGanta@gmail.com",
                    "12345678rR1@!", true, null);
            System.out.println(userAccount.getRegisterDate());
            Assert.assertEquals(null, userAccount.getRegisterDate());
        }catch(Exception e)
        {
            Assert.fail();
        }
    }


}
