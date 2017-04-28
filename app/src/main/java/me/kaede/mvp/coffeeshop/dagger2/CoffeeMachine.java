package me.kaede.mvp.coffeeshop.dagger2;

/**
 * Created by zhangyang-shenyang on 2017/4/28.
 */

import javax.inject.Inject;

/**
 * 这是一个制作Coffee的例子
 * CoffeeMaker是对制作Coffee过程的一个封装
 * 制作Coffee需要实现CoffeeMarker的makeCoffee方法
 */
public class CoffeeMachine {
    private final CoffeeMaker marker;
    CoffeeMaker maker;

    public String makeCoffee(){
        return maker.makeCoffee();
    }
    @Inject
    public CoffeeMachine(CoffeeMaker maker){
        this.marker = maker;
    }
}
