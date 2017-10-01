package com.lyc.build.extend;

import java.util.List;

public class BenzBuilder extends CarBuilder {
    private CarModel benz = new BenzModel();

    @Override
    protected void setSequences(List<String> sequences) {
        this.benz.setSequences(sequences);
    }

    @Override
    protected CarModel buildCar() {
        return this.benz;
    }
}
