package com.lyc.mediator;

import java.util.Random;

public class Sale extends AbstractColleague{
    private int saleStatus;

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void offSale() {
        super.mediator.execute("sale.offSell");
    }

    public int getSaleStatus() {
        int saleStatus = new Random(System.currentTimeMillis()).nextInt(100);
        System.out.println("IBM电脑的销售情况为："+saleStatus);
        return saleStatus;
    }

    public void sellIBMComputer(Integer number) {
        super.mediator.execute("sale.sell",number);
        System.out.println("销售IBM电脑"+number+"台");
    }
}
