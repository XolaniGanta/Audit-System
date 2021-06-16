package com.personalProject.demo.Factory;

import com.personalProject.demo.Entity.UniversityStaff;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UniversityStaffFactoryTest {
    // tests if ID is not null
    @Test
    public void createUniversityStaffID() {
        UniversityStaff universityStaff = UniversityStaffFactory.createUniversityStaff("Xolani", "Ganta", "0824568970");
        Assert.assertNotNull(universityStaff.getUniversityStaffID());
    }

    // tests if the user did put in name correctly
    @Test
    public void createUniversityStaffName() {
        UniversityStaff universityStaff = UniversityStaffFactory.createUniversityStaff("Xolani", "Ganta", "0824568970");
        Assert.assertEquals("Xolani", universityStaff.getUniversityStaffFirstName());
    }

    // tests if the user did put in surname
    @Test
    public void createUniversityStaffSurname() {
        UniversityStaff universityStaff = UniversityStaffFactory.createUniversityStaff("Xolani", "Ganta", "0824568970");
        Assert.assertEquals("Ganta", universityStaff.getUniversityStaffSurname());
    }

    // tests if the user did put in the phone number
    @Test
    public void createUniversityStaffCellphoneNumber() {
        UniversityStaff universityStaff = UniversityStaffFactory.createUniversityStaff("Xolani", "Ganta", "0824568970");
        Assert.assertEquals("0824568970", universityStaff.getUniversityStaffCellPhone());
    }
}