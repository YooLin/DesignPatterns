package com.lyc.filter_chain;

public class Husband extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return Level.MARRIED;
    }

    @Override
    protected Response handle() {
        return new Response(4444,"丈夫","无法联系到丈夫");
    }
}
