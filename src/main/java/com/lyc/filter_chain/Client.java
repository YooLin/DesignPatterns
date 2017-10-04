package com.lyc.filter_chain;

public class Client {
    public static void main(String[] args) {
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();

        father.setNextHandler(husband);
        husband.setNextHandler(son);

        for (int i = 1; i <= 5; i++) {
            IWoman woman = new Woman();
            Request request = woman.getRequest();
            System.out.println(request.getType());
            Response response = father.handleRequest(request);
            System.out.println(response);
        }
    }
}