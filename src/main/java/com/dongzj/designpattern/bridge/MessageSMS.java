package com.dongzj.designpattern.bridge;

/**
 * 以站内短消息的方式发送消息
 *
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 09:32
 */
public class MessageSMS implements MessageImplementor {

    public void send(String message, String toUser) {
        System.out.println("使用站内短消息的方式，发送消息'" + message + "'给" + toUser);
    }
}
