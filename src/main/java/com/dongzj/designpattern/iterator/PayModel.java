package com.dongzj.designpattern.iterator;

/**
 * 工资描述模型对象
 *
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 13:37
 */
public class PayModel {

    /**
     * 支付工资的人员
     */
    private String userName;

    /**
     * 支付的工资数额
     */
    private double pay;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "PayModel{" +
                "userName='" + userName + '\'' +
                ", pay=" + pay +
                '}';
    }
}
