package com.dongzj.designpattern.command;

/**
 * 开机命令的实现
 * 持有开机命令的真正实现，通过调用接收者的方法来实现命令
 *
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 14:27
 */
public class OpenCommand implements Command{

    /**
     * 持有真正实现命令的接收者--主板对象
     */
    private MainBoardApi mainBoard = null;

    public OpenCommand(MainBoardApi mainBoard) {
        this.mainBoard = mainBoard;
    }

    public void execute() {
        //对于命令对象，根部不知道如何开机，会转调主板对象
        //让主板去完成开机的功能
        this.mainBoard.open();
    }
}
