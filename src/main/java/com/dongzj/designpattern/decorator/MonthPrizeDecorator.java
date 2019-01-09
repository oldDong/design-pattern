package com.dongzj.designpattern.decorator;

import java.util.Date;

/**
 * 装饰器对象，计算当月业务奖金
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 10:46
 */
public class MonthPrizeDecorator extends Decorator {

    public MonthPrizeDecorator(Component c) {
        super(c);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        //先获取前面计算出来的奖金
        double money = super.calcPrize(user, begin, end);
        //然后计算当月业务奖金，按照人员和时间去获取当月的业务额，然后再乘3%
        double prize = TempDB.mapMonthSaleMoney.get(user) * 0.03;
        System.out.println(user + "当月业务奖金" + prize);
        return money + prize;
    }
}
