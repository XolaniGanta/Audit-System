package com.personalProject.demo.Factory;

import com.personalProject.demo.Entity.Issue;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IssueFactoryTest {

    Issue issueDummy1;
    Issue issueDummy2;

    @Test
    public void assertIssueID_IssueRaisedDate_NotNull() {

        issueDummy1 = IssueFactory.createIssue("","");

        Assert.assertNotNull(issueDummy1.getIssueID());
        Assert.assertNotNull(issueDummy1.getIssueRaisedDate());

    }

    @Test
    public void assertIssueID_Unique(){

        issueDummy1 = IssueFactory.createIssue("Health", "Expired cafeteria food");
        issueDummy2 = IssueFactory.createIssue("Safety","Broken toilet mirrors");

        Assert.assertNotEquals(issueDummy1.getIssueID(), issueDummy2.getIssueID());
    }


}