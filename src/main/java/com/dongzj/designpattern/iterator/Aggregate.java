package com.dongzj.designpattern.iterator;

/**
 * 聚合对象的接口，定义创建相应迭代器对象的接口
 *
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 11:35
 */
public abstract class Aggregate {

    /**
     * 工厂方法，创建相应迭代器对象的接口
     *
     * @return
     */
    public abstract Iterator createIterator();
}
