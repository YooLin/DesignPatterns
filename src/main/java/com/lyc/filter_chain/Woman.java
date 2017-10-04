package com.lyc.filter_chain;

public class Woman implements IWoman {
    private Level type;
    private Request request;

    public Woman() {
        this.type = Level.randomType();
        this.request = Request.valueOf(this.type.getType());
    }

    @Override
    public Level getType() {
        return this.type;
    }

    @Override
    public Request getRequest() {
        return this.request;
    }
}
