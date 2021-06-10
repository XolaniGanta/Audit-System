package com.personalProject.demo.Factory;

import com.personalProject.demo.Entity.Report;
import com.personalProject.demo.Util.GenerateDate;
import com.personalProject.demo.Util.GenerateID;

import java.time.LocalDate;

public class ReportFactory
{
    public static Report createReport(String reportAuth)
    {
        String reportId = GenerateID.generateID();
        LocalDate date = GenerateDate.generateDate();
        return new Report.Builder()
                .setReportId(reportId)
                .setReportAuth(reportAuth)
                .setReportDate(date)
                .build();
    }
}