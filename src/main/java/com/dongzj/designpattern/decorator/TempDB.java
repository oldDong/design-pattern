package com.dongzj.designpattern.decorator;

import java.util.HashMap;
import java.util.Map;

/**
 * 在内存中模拟数据库，准备测试数据
 *
 * User: dongzj
 * Mail: dongzj@shinemo.com
 * Date: 2019/1/9
 * Time: 10:39
 */
public class TempDB {

    public static Map<String, Double> mapMonthSaleMoney = new HashMap<String, Double>();

    //填充测试数据
    static {
        mapMonthSaleMoney.put("张三", 10000.0);
        mapMonthSaleMoney.put("李四", 20000.0);
        mapMonthSaleMoney.put("王五", 30000.0);
    }
}
