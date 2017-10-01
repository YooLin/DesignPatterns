package com.lyc.mediator;

public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }


    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }

    public void buyIBMComputer(int number) {
        super.mediator.execute("purchase.buy",number);
    }
}
