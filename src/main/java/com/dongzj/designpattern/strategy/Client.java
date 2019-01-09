package com.dongzj.designpattern.strategy;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 15:17
 */
public class Client {

    public static void main(String[] args) {
        //选择并创建需要使用的策略对象
        Strategy strategy = new LargeCustomerStrategy();

        //创建上下文
        Price ctx = new Price(strategy);

        //计算报价
        double quote = ctx.quote(1000);
        System.out.println("向客户报价：" + quote);
    }
}
