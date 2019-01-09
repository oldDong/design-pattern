package com.dongzj.designpattern.iterator;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 11:26
 */
public interface Iterator {

    /**
     * 移动到聚合对象的第一个位置
     */
    void first();

    /**
     * 移动到聚合对象的下一个位置
     */
    void next();

    /**
     * 判断是否已经移动到聚合对象的最后一个位置
     *
     * @return
     */
    boolean isDone();

    /**
     * 获取迭代的当前元素
     *
     * @return
     */
    Object currentItem();
}
