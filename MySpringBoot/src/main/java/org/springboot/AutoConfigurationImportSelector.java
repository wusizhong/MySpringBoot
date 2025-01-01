package org.springboot;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class AutoConfigurationImportSelector implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //实现自动配置类的逻辑
        // 1. 获取到所有的自动配置类
        // 2. 过滤出需要的自动配置类
        //getCandidateConfigurations
        // 自动配置类的名字
        return new String[0];
    }
}
