package com.lyc.filter_chain;

public class Father extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return Level.SINGLE;
    }

    @Override
    protected Response handle() {
        return new Response<String>(8888, "父亲", "同意");
    }
}
