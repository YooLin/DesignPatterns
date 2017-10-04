package com.lyc.filter_chain;

public abstract class Handler {
    private Handler nextHandler;

    protected final Response handleRequest(Request request) {
        Response response = null;
        if (this.getHandlerLevel().getType() >= request.getType())
            response = this.handle();
        if (response != null && response.getCode() != 4444)
            return response;
        else if (response != null)
            System.out.println(response.getData() + ",请求下个处理人");
        if (nextHandler != null)
            return this.nextHandler.handleRequest(request);
        return null;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected abstract Level getHandlerLevel();

    protected abstract Response handle();
}
