package com.lyc.build.extend;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author YooLin
 * @Date 2017/8/10 16:52
 * @Description 封装一个导演类，指挥各个事件的先后顺序
 * 告知执行顺序后，马上生产一辆车，而不去细究底层是怎么生产的
 */
public class Director {
    private final CarBuilder benzBuilder = new BenzBuilder();
    private final CarBuilder bmwBuilder = new BMWBuilder();
    private final List<String> sequences = new ArrayList<>();


    public CarModel buildBenzA(){
        //这里很容易被忽略 如果不清理的话，会引起数据混乱
        this.sequences.clear();
        this.sequences.add("engine boom");
        this.sequences.add("start");
        this.sequences.add("alarm");
        this.sequences.add("stop");
        this.benzBuilder.setSequences(this.sequences);
        return this.benzBuilder.buildCar();
    }

    public CarModel buildBenzB(){
        this.sequences.clear();
        this.sequences.add("start");
        this.sequences.add("alarm");
        this.sequences.add("stop");
        this.benzBuilder.setSequences(this.sequences);
        return this.benzBuilder.buildCar();
    }

    public CarModel buildBenzC(){
        this.sequences.clear();
        this.sequences.add("start");
        this.sequences.add("stop");
        this.benzBuilder.setSequences(this.sequences);
        return this.benzBuilder.buildCar();
    }

    public CarModel buildBMWA(){
        this.sequences.clear();
        this.sequences.add("engine boom");
        this.sequences.add("start");
        this.sequences.add("alarm");
        this.bmwBuilder.setSequences(this.sequences);
        return this.bmwBuilder.buildCar();
    }

    public CarModel buildBMWB(){
        this.sequences.clear();
        this.sequences.add("engine boom");
        this.sequences.add("start");
        this.bmwBuilder.setSequences(this.sequences);
        return this.bmwBuilder.buildCar();
    }
}
