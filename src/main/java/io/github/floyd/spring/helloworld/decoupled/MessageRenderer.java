package io.github.floyd.spring.helloworld.decoupled;

/**
 * @author floyd
 */
interface MessageRenderer {

    /**
     * 输出信息
     */
    void render();

    /**
     * 设置信息来源
     * @param provider 来源提供者，从一个类（对象）那里得到信息
     */
    void setMessageProvider(MessageProvider provider);

    /**
     * 返回是谁（类，对象）提供的信息
     * @return 提供信息的对象 MessageProvider
     */
    MessageProvider getMessageProvider();
}
