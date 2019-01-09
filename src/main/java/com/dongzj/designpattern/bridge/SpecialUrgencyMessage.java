package com.dongzj.designpattern.bridge;

/**
 * 特急消息
 *
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 09:43
 */
public class SpecialUrgencyMessage extends AbstractMessage{

    public SpecialUrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    public void huery(String messageId) {
        //执行催促的业务，发出催促的信息
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "特急：" + message;
        super.sendMessage(message, toUser);
        //还需要增加一条催促的消息
    }
}
