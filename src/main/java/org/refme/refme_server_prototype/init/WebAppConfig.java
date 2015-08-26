package org.refme.refme_server_prototype.init;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author prashant
 */
@Configuration
@ComponentScan("org.refme.refme_server_prototype")
@EnableWebMvc
public class WebAppConfig {    
//    @Bean
//    public InternalResourceViewResolver setupViewResolver(){
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/");
//        resolver.setSuffix(".jsp");
//        resolver.setViewClass(JstlView.class);
//        return resolver;
//    }
}
