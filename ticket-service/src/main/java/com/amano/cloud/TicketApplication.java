package com.amano.cloud;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@RestController
@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableScheduling
@EnableAsync(proxyTargetClass = true)
@EnableCaching
@EnableEurekaClient
@EnableSwagger2
@Import(SpringDataRestConfiguration.class)
public class TicketApplication {

    @RequestMapping("/health")
    public String health() {
        return "";
    }

    public static void main(String[] args) {
        System.setProperty("org.apache.tomcat.util.buf.UDecoder.ALLOW_ENCODED_SLASH", "true");
        ConfigurableApplicationContext ctx = new SpringApplicationBuilder(TicketApplication.class).web(true).run(args);

        Environment bean = ctx.getBean(Environment.class);
        for (String s : bean.getActiveProfiles()) {
            System.out.println(s);
        }
    }
}
