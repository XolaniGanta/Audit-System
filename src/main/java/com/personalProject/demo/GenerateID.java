package com.personalProject.demo;

import java.util.UUID;

public class GenerateID {


    //this is method which will generate a random ID, when pulled across other classes
    public static String generateID(){
        return UUID.randomUUID().toString();
    }


}
