package com.personalProject.demo.Factory;

import com.personalProject.demo.Entity.Department;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DepartmentFactoryTest {

    @Test

    public void testCreateDepartment()

    {
        try {
            Department department = DepartmentFactory.createDepartment("Informatics and Design");
        }
        catch (Exception ex)
        {
            Assert.fail();
        }


    }



}
