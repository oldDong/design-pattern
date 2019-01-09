package com.dongzj.designpattern.strategy;

/**
 * 价格管理，主要完成计算向客户所报价格的功能
 *
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 15:16
 */
public class Price {

    /**
     * 持有一个具体的策略对象
     */
    private Strategy strategy = null;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 报价
     * @param goodsPrice
     * @return
     */
    public double quote(double goodsPrice) {
        return this.strategy.calPrice(goodsPrice);
    }
}
