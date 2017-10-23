package com.lyc.build;

import java.util.List;

public class BenzBuilder extends CarBuilder {


    private BenzModel benz = new BenzModel();

    //设置执行顺序
    @Override
    public void setSequences(List<String> sequences) {
        this.benz.setSequences(sequences);
    }

    //建造具有指定执行顺序的模型车
    @Override
    public CarModel buildCar() {
        return this.benz;
    }
}
