package com.dongzj.designpattern.command;

/**
 * 机箱对象，本身有按钮，持有按钮对应的命令对象
 * <p>
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 14:30
 */
public class Box {

    /**
     * 开机命令对象
     */
    private Command openCommand;

    public Box(Command openCommand) {
        this.openCommand = openCommand;
    }

    public void setOpenCommand(Command openCommand) {
        this.openCommand = openCommand;
    }

    public void openButtonPressed() {
        //按下按钮，执行命令
        openCommand.execute();
    }
}
