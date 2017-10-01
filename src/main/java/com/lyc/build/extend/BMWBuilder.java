package com.lyc.build.extend;

import java.util.List;

public class BMWBuilder extends CarBuilder {
    private CarModel bmw = new BMWModel();

    @Override
    protected void setSequences(List<String> sequences) {
        this.bmw.setSequences(sequences);
    }

    @Override
    protected CarModel buildCar() {
        return this.bmw;
    }
}
