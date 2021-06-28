package com.personalProject.demo.Factory;

import com.personalProject.demo.Entity.Report;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReportFactoryTest {

    @Test
    public void createReport() {
        Report report = ReportFactory.createReport("Brian Finch");
        Assert.assertNotNull(report.getReportId());
    }

    @Test
    public void reportDate(){
        Report report = ReportFactory.createReport("Brian Finch");
        Assert.assertEquals(java.time.LocalDate.now(), report.getReportDate());
    }

    @Test
    public void reportAuthor() {
        Report report = ReportFactory.createReport("Brian Finch");
        Assert.assertEquals("Brian Finch", report.getReportAuth());
    }
}