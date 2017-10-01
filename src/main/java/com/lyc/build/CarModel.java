package com.lyc.build;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author YooLin
 * @Date 2017/8/10 16:41
 * @Description 模板模式
 */
public abstract class CarModel {
    private List<String> sequences = new ArrayList<>();

    protected void setSequences(List<String> sequences) {
        this.sequences = sequences;
    }

    protected abstract void engineBoom();

    protected abstract void start();

    protected abstract void alarm();

    protected abstract void stop();

    //根据指定的顺序来执行
    protected void run() {
        if (sequences != null) {
            for (String sequence : sequences) {
                switch (sequence) {
                    case "engine boom":
                        engineBoom();
                        break;
                    case "start":
                        start();
                        break;
                    case "alarm":
                        alarm();
                        break;
                    case "stop":
                        stop();
                        break;
                }
            }
        }
    }
}
