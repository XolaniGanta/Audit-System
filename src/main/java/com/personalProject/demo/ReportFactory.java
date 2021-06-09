package com.personalProject.demo;

import com.personalProject.demo.Entity.Report;

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