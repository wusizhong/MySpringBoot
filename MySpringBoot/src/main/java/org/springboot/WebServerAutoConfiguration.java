package org.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServerAutoConfiguration implements AutoConfiguration{
    @Bean
//    @Conditional(TomcatCondition.class)
    @ConditionalOnClass("org.apache.catalina.startup.Tomcat")
    public TomcatWebServer tomcatWebServer() {
        return new TomcatWebServer();
    }
    @Bean
//    @Conditional(JeetyCondition.class)
    @ConditionalOnClass("org.eclipse.jetty.server.Server")
    public JeetyWebServer jeetyWebServer() {
        return new JeetyWebServer();
    }
}
