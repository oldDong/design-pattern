package com.dongzj.designpattern.iterator;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 13:42
 */
public class SalaryManager extends Aggregate {

    /**
     * 用数组管理
     */
    private PayModel[] pms = null;

    /**
     * 获取工资列表
     *
     * @return
     */
    public PayModel[] getPays() {
        return pms;
    }

    /**
     * 计算工资
     */
    public void calcSalary() {
        PayModel pm1 = new PayModel();
        pm1.setPay(5000);
        pm1.setUserName("王五");

        PayModel pm2 = new PayModel();
        pm2.setPay(6000);
        pm2.setUserName("赵六");

        pms = new PayModel[2];
        pms[0] = pm1;
        pms[1] = pm2;
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIteratorImpl(this);
    }

    public Object get(int index) {
        Object obj = null;
        if (index < pms.length) {
            obj = pms[index];
        }
        return obj;
    }

    public int size() {
        return this.pms.length;
    }
}
