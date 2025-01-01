package org.springboot;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class TomcatCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 判断逻辑
        try {
            context.getClassLoader().loadClass("org.apache.catalina.startup.Tomcat");
        } catch (ClassNotFoundException e) {
            return false;
        }
        return true;
    }
}
