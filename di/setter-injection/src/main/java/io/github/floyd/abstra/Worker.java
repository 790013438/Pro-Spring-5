package io.github.floyd.abstra;

import java.util.Arrays;

/**
 * 此类的主要功能是： <br/>
 * 1. 处理<br/>
 * 此类提供的主要方法有：<br/>
 * 1.
 *
 * @author chengmiao
 * @version 1.0
 * ClassName io.github.floyd.abstra
 * Company: com.yinhai
 * date 2020/8/29
 * @see *#
 */
public class Worker extends Person {

    String[] paths;

    @Override
    public void get() {
        super.get();
        System.out.println("继承抽象类, Work");
        System.out.println(getB());
        System.out.println(Arrays.toString(paths));
        System.out.println();
    }

    public String[] getPaths() {
        return paths;
    }

    public void setPaths(String[] paths) {
        this.paths = paths;
    }
}
