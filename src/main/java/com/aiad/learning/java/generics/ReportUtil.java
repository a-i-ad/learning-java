package com.aiad.learning.java.generics;

public class ReportUtil {
    /**
     * レポートのデータを生成する。
     * @return
     */
    public static ReportDto createReport() {
        ReportDto report = new ReportDto();
        report.records = new RecordsDto();
        report.total = new TotalDto();
        return report;
    }

    public static ReportDto createReport2() {
        ReportDto report = new ReportDto();
        report.records = new RecordsDto2();
        report.total = new TotalDto2();
        return report;
    }
}
