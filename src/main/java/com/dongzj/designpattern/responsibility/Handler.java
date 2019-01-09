package com.dongzj.designpattern.responsibility;

/**
 * 定义职责对象的接口
 * <p>
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 10:06
 */
public abstract class Handler {

    /**
     * 持有下一个处理请求的对象
     */
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理聚餐费用的申请
     *
     * @param user 申请人
     * @param fee  申请的费用
     * @return 成功或失败的具体通知
     */
    public abstract String handleFeeRequest(String user, double fee);
}
