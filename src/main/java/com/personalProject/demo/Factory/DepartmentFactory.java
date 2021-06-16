package com.personalProject.demo.Factory;

import com.personalProject.demo.Entity.Department;
import com.personalProject.demo.Util.GenerateID;

public class DepartmentFactory {


    public static Department createDepartment(String depName ) {
        String depId = GenerateID.generateID();
        Department department = new Department.Builder()
                .setDepid(depId)
                .setDepName(depName)
                .build();

        return department;
    }
    }
