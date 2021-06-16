package com.personalProject.demo.Factory;

import com.personalProject.demo.Entity.Faculty;
import com.personalProject.demo.Util.GenerateID;

public class FacultyFactory {

    public static Faculty createFaculty(String facultyName) throws Exception {

        String facultyId = GenerateID.generateID();

        Faculty faculty = new Faculty.Builder()
                .setFacultyId(facultyId)
                .setFacultyName(facultyName)
                .build();

        return faculty;
    }
}