package com.dongzj.designpattern.bridge;

/**
 * 实现发送消息的统一接口
 *
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 09:29
 */
public interface MessageImplementor {

    /**
     * 发送消息
     *
     * @param message   消息内容
     * @param toUser    消息接收人员
     */
    void send(String message, String toUser);
}
