package com.dongzj.designpattern.decorator;

import java.util.Date;

/**
 * 计算奖金的组件接口
 *
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 10:40
 */
public abstract class Component {

    /**
     * 计算某人在某时间段内的奖金
     * @param user
     * @param begin
     * @param end
     * @return
     */
    public abstract double calcPrize(String user, Date begin, Date end);
}
