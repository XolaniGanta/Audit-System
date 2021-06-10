package com.personalProject.demo.Util;

import java.time.LocalDate;

public class GenerateDate
{
    // This method checks the current date of the localhost and returns it when called upon by other classes
    public static LocalDate generateDate()
    {
        return java.time.LocalDate.now();
    }
}

