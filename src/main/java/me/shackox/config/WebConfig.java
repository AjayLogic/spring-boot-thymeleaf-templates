package me.shackox.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templateresolver.FileTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

import javax.annotation.PostConstruct;

/**
 * Created by SHACKOX on 20/01/17.
 */

@Configuration
public class WebConfig {

    @Autowired
    private SpringTemplateEngine templateEngine;

    @PostConstruct
    public void extension () {
        FileTemplateResolver resolver = new FileTemplateResolver();
        resolver.setPrefix("classpath:/templates/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML5");
        resolver.setOrder(templateEngine.getTemplateResolvers().size());
        resolver.setCacheable(false);
        templateEngine.addTemplateResolver(resolver);
    }

//    @Bean
//    public ITemplateResolver templateResolver() {
//        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
//        resolver.setPrefix("classpath:/templates/");
//        resolver.setSuffix(".html");
//        resolver.setTemplateMode("HTML5");
//        resolver.setCacheable(false);
//        return resolver;
//    }
}
