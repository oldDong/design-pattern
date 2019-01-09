package com.dongzj.designpattern.strategy;

/**
 * 为大客户计算应报的价格
 * <p>
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 15:15
 */
public class LargeCustomerStrategy implements Strategy {

    public double calPrice(double goodsPrice) {
        System.out.println("对于大客户，统一折扣10%");
        return goodsPrice * 0.9;
    }
}
