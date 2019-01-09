package com.dongzj.designpattern.strategy;

/**
 * 老客户计算应报的价格
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 15:13
 */
public class OldCustomerStrategy implements Strategy{

    public double calPrice(double goodsPrice) {
        System.out.println("对于老客户，统一折扣5%");
        return goodsPrice * 0.095;
    }
}
