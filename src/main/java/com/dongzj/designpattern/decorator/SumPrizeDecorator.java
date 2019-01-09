package com.dongzj.designpattern.decorator;

import java.util.Date;

/**
 * 装饰器对象，计算累计奖金
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 11:02
 */
public class SumPrizeDecorator extends Decorator{

    public SumPrizeDecorator(Component c) {
        super(c);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        //先获取前面运算出来的奖金
        double money = super.calcPrize(user, begin, end);
        //然后计算累计奖金
        double prize = 1000000 * 0.001;
        System.out.println(user + "累计奖金" + prize);
        return money + prize;
    }
}
