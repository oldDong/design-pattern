package com.dongzj.designpattern.decorator;

import java.util.Date;

/**
 * 装饰器对象，计算当月团队业务奖金
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 11:05
 */
public class GroupPrizeDecorator extends Decorator {

    public GroupPrizeDecorator(Component c) {
        super(c);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        //先获取前面计算踹的奖金
        double money = super.calcPrize(user, begin, end);
        //然后计算当月团队业务奖金，先计算出团队总的业务额，然后再乘以1%
        double group = 0.0;
        for (double d : TempDB.mapMonthSaleMoney.values()) {
            group += d;
        }
        double prize = group * 0.01;
        System.out.println(user + "当月团队业务奖金" + prize);
        return money + prize;
    }
}
