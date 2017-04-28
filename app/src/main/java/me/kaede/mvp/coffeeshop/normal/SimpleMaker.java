package me.kaede.mvp.coffeeshop.normal;

/**
 * Created by zhangyang-shenyang on 2017/4/28.
 */

public class SimpleMaker implements CoffeeMaker {
    Cooker cooker;  //现在需要咖啡师来制作咖啡了
    @Override
    public String makeCoffee() {
        return  "Coffee is made by SimperMarker";
    }
    public SimpleMaker(Cooker cooker){
        this.cooker = cooker;
    }
}
