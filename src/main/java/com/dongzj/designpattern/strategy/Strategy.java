package com.dongzj.designpattern.strategy;

/**
 * 策略，定义计算报价算法的接口
 *
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 15:10
 */
public interface Strategy {

    /**
     * 计算应报的价格
     *
     * @param goodsPrice
     * @return
     */
    double calPrice(double goodsPrice);
}
