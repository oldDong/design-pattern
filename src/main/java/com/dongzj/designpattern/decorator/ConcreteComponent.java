package com.dongzj.designpattern.decorator;

import java.util.Date;

/**
 * 基本的实现计算奖金的类，也是被装饰器装饰的对象
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 10:43
 */
public class ConcreteComponent extends Component{

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        return 0;
    }
}
