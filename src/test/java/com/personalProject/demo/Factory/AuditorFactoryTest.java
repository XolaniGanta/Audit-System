package com.personalProject.demo.Factory;

import com.personalProject.demo.Entity.Auditor;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AuditorFactoryTest {

    // tests if ID is not null
    @Test
    public void createAuditorID() {
        Auditor auditor = AuditorFactory.createAuditor("Xolani", "Ganta", "0824338970");
        Assert.assertNotNull(auditor.getAuditorID());
    }

    // tests if the user did put in name correctly
    @Test
    public void createAuditorName() {
        Auditor auditor = AuditorFactory.createAuditor("Xolani", "Ganta", "0824338970");
        Assert.assertEquals("Xolani", auditor.getAuditorFirstName());
    }

    // tests if the user did put in surname
    @Test
    public void createAuditorSurname() {
        Auditor auditor = AuditorFactory.createAuditor("Xolani", "Ganta", "0824338970");
        Assert.assertEquals("Ganta", auditor.getAuditorSurname());
    }

    // tests if the user did put in the phone number
    @Test
    public void createAuditorCellphoneNumber() {
        Auditor auditor = AuditorFactory.createAuditor("Xolani", "Ganta", "0824338970");
        Assert.assertEquals("0824338970", auditor.getAuditorCellPhone());
    }
}
