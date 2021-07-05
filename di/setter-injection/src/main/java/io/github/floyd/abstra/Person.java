package io.github.floyd.abstra;

import io.github.floyd.di.BookwormOracle;
import io.github.floyd.di.Oracle;

import java.math.BigDecimal;

/**
 * 此类的主要功能是： <br/>
 * 1. 处理<br/>
 * 此类提供的主要方法有：<br/>
 * 1.
 *
 * @author chengmiao
 * @version 1.0
 * ClassName io.github.floyd.di
 * Company: com.yinhai
 * date 2020/8/29
 * @see *#
 */
public abstract class Person {
    private Oracle bookwormOracle;
    private BigDecimal b;

    public void get() {
        System.out.println(bookwormOracle.defineMeaningOfLife());
    }

    public Oracle getBookwormOracle() {
        return bookwormOracle;
    }

    public void setBookwormOracle(Oracle bookwormOracle) {
        this.bookwormOracle = bookwormOracle;
    }

    public BigDecimal getB() {
        return b;
    }

    public void setB(BigDecimal b) {
        this.b = b;
    }
}
