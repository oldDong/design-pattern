package com.dongzj.designpattern.single;

/**
 * 单例模式
 *
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 09:56
 */
public class Singleton {

    /**
     * 构造方法私有化
     */
    private Singleton() {}

    /**
     * 静态私有变量，使用volatile保证了多线程访问时instance变量的可见性
     */
    private static volatile Singleton instance;

    /**
     * 静态方法，返回该类的实例
     * @return
     */
    public static Singleton getInstance() {
        //instance不为null时，直接返回，提高运行效率
        if (instance == null) {
            //同步代码块，避免对象被重复创建
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
