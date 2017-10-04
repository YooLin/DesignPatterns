package com.lyc.filter_chain;

public enum Request {

    FATHER_REQUEST(1), HUSBAND_REQUEST(2), SON_REQUEST(3);//请求类型 1-请求父亲 2-请求丈夫 3-请求儿子

    private int type;

    Request(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public Level getRequestLevel() {
        return Level.valueOf(this.type);
    }

    public static Request valueOf(int type) {
        for (Request request : Request.values()) {
            if (request.getType() == type)
                return request;
        }
        return null;
    }
}
