package com.lyc.build;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
        //指定执行顺序
        List<String> sequences = new ArrayList<>();
        sequences.add("engine boom");
        sequences.add("start");
        sequences.add("alarm");
        sequences.add("stop");
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequences(sequences);
        CarModel benz = benzBuilder.buildCar();
        benz.run();
        //重置执行顺序
        sequences.clear();
        sequences.add("start");
        sequences.add("stop");
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequences(sequences);
        CarModel bmw = bmwBuilder.buildCar();
        bmw.run();
    }
}
