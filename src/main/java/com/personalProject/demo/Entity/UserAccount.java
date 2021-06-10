package com.personalProject.demo.Entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class UserAccount implements Serializable
{

    private String userId;


    private String email;
    private String password;
    private boolean loginStatus;
    private LocalDate registerDate;

    protected UserAccount(){}

    //
    private UserAccount(Builder builder){
        this.userId = builder.userId;
        this.email = builder.email;
        this.password = builder.password;
        this.loginStatus = builder.loginStatus;
        this.registerDate = builder.registerDate;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    @Override
    public String toString() {
        return  "UserAccount{" +
                "userId=" + userId +
                ", email=" + email +
                ", password=" + password +
                ", loginStatus=" + loginStatus +
                ", registerDate=" + registerDate +
                '}';
    }

    //
    public static class Builder {

        private String userId;
        private String email;
        private String password;
        private boolean loginStatus;
        private LocalDate registerDate;


        public Builder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setLoginStatus(boolean loginStatus) {
            this.loginStatus = loginStatus;
            return this;
        }

        public Builder setRegisterDate(LocalDate registerDate) {
            this.registerDate = registerDate;
            return this;
        }

        public Builder copy(UserAccount useraccount)
        {
            this.userId = useraccount.userId;
            this.email = useraccount.email;
            this.password = useraccount.password;
            this.loginStatus = useraccount.loginStatus;
            this.registerDate = useraccount.registerDate;
            return this;
        }

        //
        public UserAccount build(){
            return new UserAccount(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAccount that = (UserAccount) o;
        return userId.equals(that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }
}


