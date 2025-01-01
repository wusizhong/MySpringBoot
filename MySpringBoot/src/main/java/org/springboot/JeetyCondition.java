package org.springboot;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class JeetyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 判断逻辑
        try {
            context.getClassLoader().loadClass("org.eclipse.jetty.server.Server");
        } catch (ClassNotFoundException e) {
            return false;
        }
        return true;
    }
}
