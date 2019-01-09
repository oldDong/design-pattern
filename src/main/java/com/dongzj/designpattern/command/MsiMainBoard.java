package com.dongzj.designpattern.command;

/**
 * 微星主板类，开机命令的真正实现者，在command模式中充当Receiver
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 14:22
 */
public class MsiMainBoard implements MainBoardApi{

    public void open() {
        System.out.println("微星主板现在正在开机，请稍等");
        System.out.println("接通电源。。。。。。");
        System.out.println("设备检查。。。。。。");
        System.out.println("装载系统。。。。。。");
        System.out.println("机器正常晕妆起来。。。。。。");
        System.out.println("机器已经正常打开，请操作");
    }
}
