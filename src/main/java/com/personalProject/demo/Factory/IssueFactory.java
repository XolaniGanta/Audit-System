package com.personalProject.demo.Factory;

import com.personalProject.demo.Entity.Issue;
import com.personalProject.demo.Util.GenerateID;
import com.personalProject.demo.Util.GenerateIssueRaisedDate;

import java.time.LocalDateTime;

public class IssueFactory {
    public static Issue createIssue(String issueArea, String issueDescription) {

        String issueId = GenerateID.generateID();
        LocalDateTime issueRaisedDate = GenerateIssueRaisedDate.generateIssueRaisedDate();

        Issue issue = new Issue.Builder()
                .setIssueID(issueId)
                .setIssueStatus(true)
                .setIssueRaisedDate(issueRaisedDate)
                .setIssueArea(issueArea)
                .setIssueDescription(issueDescription)
                .build();
        return issue;
    }
}

