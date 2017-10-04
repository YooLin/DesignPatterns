package com.lyc.filter_chain;

public class Son extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return Level.WIDOW;
    }

    @Override
    protected Response handle() {
        return new Response(8888, "儿子", "同意");
    }
}
