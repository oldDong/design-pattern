package com.dongzj.designpattern.responsibility;

/**
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 10:17
 */
public class Client {

    public static void main(String[] args) {
        //先组装职责链
        Handler h1 = new GeneralManager();
        Handler h2 = new DeptManager();
        Handler h3 = new ProjectManager();

        h3.setSuccessor(h2);
        h2.setSuccessor(h1);

        String ret1 = h3.handleFeeRequest("小李", 300);
        System.out.println("the ret1=" + ret1);

        String ret2 = h3.handleFeeRequest("小张", 300);
        System.out.println("the ret2=" + ret2);

        String ret3 = h3.handleFeeRequest("小李", 600);
        System.out.println("the ret3=" + ret3);

        String ret4 = h3.handleFeeRequest("小张", 600);
        System.out.println("the ret4=" + ret4);

        String ret5 = h3.handleFeeRequest("小李", 1200);
        System.out.println("the ret5=" + ret5);

        String ret6 = h3.handleFeeRequest("小张", 1200);
        System.out.println("the ret6=" + ret6);
    }
}
