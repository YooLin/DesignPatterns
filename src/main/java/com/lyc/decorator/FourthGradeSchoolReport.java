package com.lyc.decorator;

public class FourthGradeSchoolReport implements SchoolReport {
    @Override
    public void report() {
        System.out.println("数学：79 英语：89 语文：82");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签字：" + name);
    }
}
