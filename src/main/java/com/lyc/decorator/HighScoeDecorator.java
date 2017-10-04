package com.lyc.decorator;

public class HighScoeDecorator extends Decorator {
    public HighScoeDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }

    public void reportHighScore(){
        System.out.println("报告高分 英语：89");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
