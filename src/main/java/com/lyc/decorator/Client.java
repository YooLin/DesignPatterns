package com.lyc.decorator;

public class Client {
    public static void main(String[] args) {
        System.out.println("儿子拿着成绩单给父亲签字");
        SchoolReport report = new FourthGradeSchoolReport();
        report = new HighScoeDecorator(report);
        report = new SortDecorator(report);
        report.report();
        System.out.println("需要家长签字");
        report.sign("father's name");
    }
}
