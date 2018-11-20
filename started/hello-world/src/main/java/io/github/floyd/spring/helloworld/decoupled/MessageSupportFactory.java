package io.github.floyd.spring.helloworld.decoupled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * @author floyd
 */
public class MessageSupportFactory {
    private static MessageSupportFactory instance;
    private static final Logger logger = LoggerFactory.getLogger(MessageSupportFactory.class);

    private MessageRenderer messageRender;
    private MessageProvider messageProvider;

    private MessageSupportFactory() {
        Properties properties = new Properties();

        try {
            properties.load(this.getClass().getResourceAsStream("/msf.properties"));

            String renderClass = properties.getProperty("renderer.class");
            String providerClass = properties.getProperty("provider.class");

            messageRender = (MessageRenderer) Class.forName(renderClass).newInstance();
            messageProvider = (MessageProvider) Class.forName(providerClass).newInstance();
        } catch (Exception ex) {
            logger.error(ex.getLocalizedMessage());
        }
    }

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance() {
        return instance;
    }

    public MessageRenderer getMessageRenderer() {
        return messageRender;
    }

    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
