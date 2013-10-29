package com.tomatoblog.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
//import org.springframework.web.servlet.view.JstlView;

// import org.thymeleaf.spring3.SpringTemplateEngine;
// import org.thymeleaf.spring3.view.ThymeleafViewResolver;
// import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.tomatoblog.controllers"})
public class WebConfig extends WebMvcConfigurerAdapter {
	
  // @Bean
  // public ServletContextTemplateResolver templateResolver() {
  //   ServletContextTemplateResolver resolver = new ServletContextTemplateResolver();
  //   resolver.setPrefix("/WEB-INF/views/");
  //   resolver.setSuffix(".html");
  //   //NB, selecting HTML5 as the template mode.
  //   resolver.setTemplateMode("HTML5");
  //   resolver.setCacheable(false);
  //   return resolver;

  // }

  // public SpringTemplateEngine templateEngine() {
  //   SpringTemplateEngine engine = new SpringTemplateEngine();
  //   engine.setTemplateResolver(templateResolver());
  //   return engine;
  // }

	@Bean
    public ViewResolver viewResolver() {
 
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
	
	// @Bean
	// public MessageSource messageSource() {

	// 	ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	// 	messageSource.setBasenames("classpath:messages/messages", "classpath:messages/validation");
	// 	// if true, the key of the message will be displayed if the key is not
	// 	// found, instead of throwing a NoSuchMessageException
	// 	messageSource.setUseCodeAsDefaultMessage(true);
	// 	messageSource.setDefaultEncoding("UTF-8");
	// 	// # -1 : never reload, 0 always reload
	// 	messageSource.setCacheSeconds(0);
	// 	return messageSource;
	// }

}
