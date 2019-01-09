package com.dongzj.designpattern.bridge;

/**
 * 以Email的方式发送消息
 *
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 09:33
 */
public class MessageEmail implements MessageImplementor{

    public void send(String message, String toUser) {
        System.out.println("使用Email的方式，发送消息'" + message + "'给" + toUser);
    }
}
