package io.github.floyd.spring.helloworld.decoupled;

/**
 * @author floyd
 */
public interface MessageProvider {

    /**
     * 提供信息
     * @return 返回任意信息
     */
    String getMessage();

}
