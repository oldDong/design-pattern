package com.dongzj.designpattern.responsibility;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 10:11
 */
public class DeptManager extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        //部门经理的权限只能在1000以内
        String str = "";
        if (fee < 1000) {
            //为了测试，只同意小李申请的
            if ("小李".equals(user)) {
                str = "部门经理同意'" + user + "'聚餐费用" + fee + "元的请求";
            } else {
                str = "部门经理不同意'" + user + "'聚餐费用" + fee + "元的请求";
            }
            return str;
        } else {
            //超过1000，继续传递给更高级别的人处理
            if (this.successor != null) {
                return this.successor.handleFeeRequest(user, fee);
            }
        }
        return str;
    }
}
