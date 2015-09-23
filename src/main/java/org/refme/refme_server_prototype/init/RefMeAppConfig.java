package org.refme.refme_server_prototype.init;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 *
 * @author prashant
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="org.refme.refme_server_prototype")
public class RefMeAppConfig
{
//  @Bean
//  public ViewResolver viewResolver(){
//      InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//     // viewResolver.setViewClass(JstlView.class);
//      viewResolver.setPrefix("/WEB-INF/views");
//      viewResolver.setSuffix(".jsp");
//      return viewResolver;
//  }
//  
//  @Bean
//  public MessageSource messageSource(){
//      ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//      messageSource.setBasename("messages");
//      return messageSource;
//  }
}

