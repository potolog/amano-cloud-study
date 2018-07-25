package com.amano.cloud;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextRegistry implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    public ApplicationContextRegistry() {
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
