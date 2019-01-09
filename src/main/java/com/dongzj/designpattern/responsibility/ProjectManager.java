package com.dongzj.designpattern.responsibility;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 10:19
 */
public class ProjectManager extends Handler{


    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        if (fee < 500) {
            //为了测试，只同意小李申请的
            if ("小李".equals(user)) {
                str = "项目经理同意'" + user + "'聚餐费用" + fee + "元的请求";
            } else {
                str = "项目经理不同意'" + user + "'聚餐费用" + fee + "元的请求";
            }
            return str;
        } else {
            //超过500，继续传递给更高的人处理
            if (this.successor != null) {
                return this.successor.handleFeeRequest(user, fee);
            }
        }
        return str;
    }
}
