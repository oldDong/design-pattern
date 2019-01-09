package com.dongzj.designpattern.decorator;

import java.util.Date;

/**
 * 装饰器接口，需要跟被装饰器的对象实现同样的接口
 *
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 10:44
 */
public abstract class Decorator extends Component{

    /**
     * 持有被装饰的组件对象
     */
    protected Component c;

    public Decorator(Component c) {
        this.c = c;
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        //转调组件对象的方法
        return c.calcPrize(user, begin, end);
    }
}
