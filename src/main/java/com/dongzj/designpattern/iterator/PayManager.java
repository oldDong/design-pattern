package com.dongzj.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户方已有的工资管理对象
 *
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 11:37
 */
public class PayManager extends Aggregate{

    /**
     * 聚合对象，这里是Java的集合对象
     */
    private List list = new ArrayList();

    /**
     * 获取工资列表
     *
     * @return
     */
    public List getPayList() {
        return list;
    }

    @Override
    public Iterator createIterator() {
        return new CollectionIteratorImpl(this);
    }

    public Object get(int index) {
        Object obj = null;
        if (index < this.list.size()) {
            obj = this.list.get(index);
        }
        return obj;
    }

    public int size() {
        return this.list.size();
    }

    /**
     * 计算工资
     */
    public void calPay() {
        PayModel pm1 = new PayModel();
        pm1.setPay(3000);
        pm1.setUserName("张三");

        PayModel pm2 = new PayModel();
        pm2.setPay(4000);
        pm2.setUserName("李四");

        list.add(pm1);
        list.add(pm2);
    }
}
