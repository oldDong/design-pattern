package com.dongzj.designpattern.bridge;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 09:45
 */
public class Client {

    public static void main(String[] args) {
        //创建一个普通消息对象
        MessageImplementor impl = new MessageSMS();
        AbstractMessage m = new CommonMessage(impl);
        m.sendMessage("请喝一杯茶","小李");

        //创建一个紧急消息对象
        m = new UrgencyMessage(impl);
        m.sendMessage("请喝一杯茶","小李");

        //创建一个特急消息对象
        m = new SpecialUrgencyMessage(impl);
        m.sendMessage("请喝一杯茶","小李");

        //把视线方式切换成手机端消息
        impl = new MessageMobile();

        m = new CommonMessage(impl);
        m.sendMessage("请喝一杯茶","小李");

        m = new UrgencyMessage(impl);
        m.sendMessage("请喝一杯茶","小李");

        m = new SpecialUrgencyMessage(impl);
        m.sendMessage("请喝一杯茶","小李");
    }
}
