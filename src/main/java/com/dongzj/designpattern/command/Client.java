package com.dongzj.designpattern.command;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 14:32
 */
public class Client {

    public static void main(String[] args) {
        //把命令和真正的实现组合起来，相当于在组装机器
        MainBoardApi mainBoard = new GigaMainBoard();
        OpenCommand openCommand = new OpenCommand(mainBoard);

        //为机箱上的按钮设置对应的命令，让按钮知道要干什么
        Box box = new Box(openCommand);

        //然后模拟按下机箱上的按钮
        box.openButtonPressed();
    }
}
