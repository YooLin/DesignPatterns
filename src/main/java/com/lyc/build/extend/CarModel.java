package com.lyc.build.extend;

import java.util.ArrayList;
import java.util.List;

public abstract class CarModel {

    private List<String> sequences = new ArrayList<>();

    protected void setSequences(List<String> sequences){
        this.sequences = sequences;
    }

    protected abstract void engineBoom();
    protected abstract void start();
    protected abstract void alarm();
    protected abstract void stop();

    protected final void run(){
        if (sequences!=null&&sequences.size()>0){
            for (String sequence:sequences){
                switch (sequence){
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
