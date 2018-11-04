package io.github.floyd.spring.helloworld.decoupled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author floyd
 */
public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;
    private static final Logger logger = LoggerFactory.getLogger(StandardOutMessageRenderer.class);

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new NotInitializedException("You must set the property messageProvider of class:"
                    + StandardOutMessageRenderer.class.getName());
        }
        logger.debug(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
