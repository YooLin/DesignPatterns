package com.lyc.mediator;

public class Stock extends AbstractColleague {
    private static int STORE_NUMBER = 100;
    private int stockNumber;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }


    public int getStockNumber() {
        return STORE_NUMBER;
    }

    public void decrease(Integer number) {
        STORE_NUMBER = STORE_NUMBER - number;
        System.out.println("库存数量为："+STORE_NUMBER);
    }

    public void increase(Integer number) {
        STORE_NUMBER = STORE_NUMBER + number;
        System.out.println("库存数量为："+STORE_NUMBER);
    }

    public void clearStock(){
        System.out.println("清理存货数量为："+STORE_NUMBER);
        super.mediator.execute("stock.clear");
    }
}
