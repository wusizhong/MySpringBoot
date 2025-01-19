package org.springboot;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class AutoConfigurationImportSelector implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //这里用的原生SPI springboot是用spring.factories（也是spi）
        ServiceLoader<AutoConfiguration> serviceLoader = ServiceLoader.load(AutoConfiguration.class);

        List<String> list = new ArrayList<>();
        for (AutoConfiguration autoConfiguration : serviceLoader) {
            list.add(autoConfiguration.getClass().getName());
        }

        return list.toArray(new String[0]);
    }
}
