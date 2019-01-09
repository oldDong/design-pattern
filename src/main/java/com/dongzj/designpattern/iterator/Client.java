package com.dongzj.designpattern.iterator;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 13:50
 */
public class Client {

    public static void main(String[] args) {
        //访问集团的工资列表
        PayManager payManager = new PayManager();
        //先计算再获取
        payManager.calPay();
        System.out.println("集团工资列表：");
        test(payManager.createIterator());

        //访问新收购公司的工资列表
        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();

        System.out.println("新收购的公司工资列表：");
        test(salaryManager.createIterator());
    }

    private static void test(Iterator it) {
        //设置迭代器到第一个元素
        it.first();

        while (!it.isDone()) {
            Object obj = it.currentItem();
            System.out.println("the obj == " + obj);
            it.next();
        }
    }
}
