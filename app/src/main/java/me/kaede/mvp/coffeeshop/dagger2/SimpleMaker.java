package me.kaede.mvp.coffeeshop.dagger2;

import javax.inject.Inject;

/**
 * Created by zhangyang-shenyang on 2017/4/28.
 */

public class SimpleMaker implements CoffeeMaker {
    Cooker cooker;  //现在需要咖啡师来制作咖啡了
    @Override
    public String makeCoffee() {
        return  "Coffee is made by SimperMarker";
    }
    @Inject
    public SimpleMaker(Cooker cooker){
        this.cooker = cooker;
    }
}
