package io.github.floyd.spring.helloworld.decoupled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 * @author pro spring 5 5th edition, floyd
 */
public class HelloWorldDecoupled {
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldDecoupled.class);

    public static void main(String... args) {
        MessageRenderer messageRenderer = new MessageRenderer() {
            private MessageProvider messageProvider;

            @Override
            public void render() {
                if (messageProvider == null) {
                    throw new NotInitException(
                            "You must set the property messageProvider of class:"
                            + MessageRenderer.class.getName());
                }
                Optional<MessageProvider> optionalMessageRenderer = Optional.of(getMessageProvider());
                logger.debug(optionalMessageRenderer.orElse(() -> MessageProvider.class.getName() + "没有初始化")
                        .getMessage());
            }

            @Override
            public void setMessageProvider(MessageProvider messageProvider) {
                this.messageProvider = messageProvider;
            }

            @Override
            public MessageProvider getMessageProvider() {
                return this.messageProvider;
            }
        };

        messageRenderer.setMessageProvider(() -> "Hello World!");
        messageRenderer.render();
    }

    /**
     * 错误类
     */
    private static class NotInitException extends RuntimeException {
        NotInitException(String name) {
            super(name);
        }
    }
}
