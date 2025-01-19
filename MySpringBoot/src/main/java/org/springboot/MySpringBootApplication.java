package org.springboot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@ComponentScan
@Configuration
//@Import(WebServerAutoConfiguration.class)
@Import(AutoConfigurationImportSelector.class)
public @interface MySpringBootApplication {
}
