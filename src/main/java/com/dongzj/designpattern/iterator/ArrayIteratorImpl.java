package com.dongzj.designpattern.iterator;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 11:33
 */
public class ArrayIteratorImpl implements Iterator{

    /**
     * 用来存放被迭代的聚合对象
     */
    private SalaryManager aggregate = null;

    private int index = -1;

    public ArrayIteratorImpl(SalaryManager aggregate) {
        this.aggregate = aggregate;
    }

    public void first() {
        index = 0;
    }

    public void next() {
        if (index < this.aggregate.size()) {
            index = index + 1;
        }
    }

    public boolean isDone() {
        if (index == this.aggregate.size()) {
            return true;
        }
        return false;
    }

    public Object currentItem() {
        return this.aggregate.get(index);
    }
}
