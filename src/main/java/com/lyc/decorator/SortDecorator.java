package com.lyc.decorator;

public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }

    public void reportSort(){
        System.out.println("报告排名 排名：32");
    }
}
