package com.dongzj.designpattern.decorator;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 11:09
 */
public class Client {

    public static void main(String[] args) {
        //先创建计算基本奖金的类，这也是被装饰的对象
        Component c1 = new ConcreteComponent();

        //然后对计算的基本奖金进行装饰，这里要这各个装饰
        Decorator d1 = new MonthPrizeDecorator(c1);
        Decorator d2 = new SumPrizeDecorator(c1);

        double zs = d2.calcPrize("张三", null, null);
        System.out.println("张三应得奖金：" + zs);

        double ls = d2.calcPrize("李四", null, null);
        System.out.println("李四应得奖金：" + ls);

        //如果是业务经理，还需要计算团队的奖金
        Decorator d3 = new GroupPrizeDecorator(c1);
        double ww = d3.calcPrize("王五", null, null);
        System.out.println("王五应得奖金：" + ww);
    }
}
