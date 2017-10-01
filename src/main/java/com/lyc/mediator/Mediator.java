package com.lyc.mediator;

/**
 * @Author YooLin
 * @Date 2017/8/29 17:30
 * @Description 中介者模式（调停者模式）：用一个中介对象封装一系列的对象交互，中介者使各对象不需要显示地相互作用，
 * 从而使其耦合松散，而且可以独立地改变它们之间的交互
 */
public class Mediator extends AbstractMediator {
    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")) {
            this.buyComputer((Integer) objects[0]);//采购电脑
        } else if (str.equals("sale.sell")) {
            this.sellComputer((Integer) objects[0]);//销售电脑
        } else if (str.equals("sale.offSell")) {
            this.offSale();//折价销售
        } else if (str.equals("stock.clear")) {
            this.clearStock();//清仓处理
        }
    }

    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }

    private void offSale() {
        System.out.println("折价销售IBM电脑" + super.stock.getStockNumber() + "台");
    }

    private void sellComputer(Integer number) {
        int stockCount = super.stock.getStockNumber();
        if (stockCount < number) {
            super.purchase.buyIBMComputer(number - stockCount);
        }
        super.stock.decrease(number);
    }

    private void buyComputer(Integer number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus >= 80) {
            System.out.println("采购IBM电脑：" + number + "台");
            super.stock.increase(number);
        } else {
            number = number / 2;
            System.out.println("采购IBM电脑：" + number + "台");
            super.stock.increase(number);
        }
    }
}
