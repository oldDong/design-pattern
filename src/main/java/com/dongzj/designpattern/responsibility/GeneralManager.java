package com.dongzj.designpattern.responsibility;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 10:15
 */
public class GeneralManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        //总经理的权限很大，只要请求到了这里，他都可以处理
        String str = "";
        if (fee >= 1000) {
            //为了测试，只同意小李申请的
            if ("小李".equals(user)) {
                str = "总经理同意'" + user + "'聚餐费用" + fee + "元的请求";
            } else {
                str = "总经理不同意'" + user + "'聚餐费用" + fee + "元的请求";
            }
            return str;
        } else {
            //如果还有后继的处理对象，继续传递
            if (this.successor != null) {
                return this.successor.handleFeeRequest(user, fee);
            }
        }
        return str;
    }
}
