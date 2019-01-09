package com.dongzj.designpattern.strategy;

/**
 * 为新客户或者普通客户计算应报的价格
 *
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 15:12
 */
public class NormalCustomerStrategy implements Strategy{


    public double calPrice(double goodsPrice) {
        System.out.println("对应新客户或者普通客户，没有折扣");
        return goodsPrice;
    }
}
