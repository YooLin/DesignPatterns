package com.lyc.build;

import java.util.List;

public class BMWBuilder extends CarBuilder {

    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequences(List<String> sequences) {
        this.bmw.setSequences(sequences);
    }

    @Override
    public CarModel buildCar() {
        return this.bmw;
    }
}
