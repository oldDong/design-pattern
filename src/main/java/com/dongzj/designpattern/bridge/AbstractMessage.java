package com.dongzj.designpattern.bridge;

/**
 * 抽象的消息对象
 * <p>
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 09:37
 */
public abstract class AbstractMessage {

    /**
     * 持有一个实现部分的对象
     */
    protected MessageImplementor impl;

    public AbstractMessage(MessageImplementor impl) {
        this.impl = impl;
    }

    /**
     * 发送消息，调用实现部分的方法
     *
     * @param message
     * @param toUser
     */
    public void sendMessage(String message, String toUser) {
        this.impl.send(message, toUser);
    }
}
