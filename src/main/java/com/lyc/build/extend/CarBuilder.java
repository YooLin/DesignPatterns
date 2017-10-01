package com.lyc.build.extend;

import java.util.List;

public abstract class CarBuilder {
    protected abstract void setSequences(List<String> sequences);
    protected abstract CarModel buildCar();
}
