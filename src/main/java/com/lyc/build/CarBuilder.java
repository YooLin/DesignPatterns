package com.lyc.build;

import java.util.List;

/**
 * @Author YooLin
 * @Date 2017/8/10 16:45
 * @Description 建造者模式：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 */
public abstract class CarBuilder {

    public abstract void setSequences(List<String> sequences);

    public abstract CarModel buildCar();
}
