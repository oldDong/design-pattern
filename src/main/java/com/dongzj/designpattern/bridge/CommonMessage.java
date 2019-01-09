package com.dongzj.designpattern.bridge;

/**
 * 普通消息
 *
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 09:39
 */
public class CommonMessage extends AbstractMessage{

    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    /**
     * 普通消息，什么都不做，直接调用父类的方法，把消息发送出去
     * @param message
     * @param toUser
     */
    @Override
    public void sendMessage(String message, String toUser) {
        super.sendMessage(message, toUser);
    }
}
