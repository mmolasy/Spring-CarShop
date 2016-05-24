package pl.moliq.autoparts.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import pl.moliq.autoparts.services.CarService;
import pl.moliq.autoparts.servicesimpl.CarServiceImp;

@Configuration
@EnableWebMvc
//@EnableSpringConfigured
@ComponentScan({"pl.moliq.autoparts.controller", "pl.moliq.autoparts.repositoryimpl", "pl.moliq.autoparts.servicesimpl"})
public class ShopConfig extends WebMvcConfigurerAdapter{
	
	 @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	    }
	 
	 
	    @Override
	    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	        configurer.enable();
	    }
	    
	 
	    @Bean
	    public InternalResourceViewResolver jspViewResolver() {
	        InternalResourceViewResolver bean = new InternalResourceViewResolver();
	        bean.setPrefix("/WEB-INF/jsp/");
	        bean.setSuffix(".jsp");
	        return bean;
	    }
	 
//	    @Bean(name = "multipartResolver")
//	    public CommonsMultipartResolver getMultipartResolver() {
//	        return new CommonsMultipartResolver();
//	    }
//	 
	    @Bean(name = "messageSource")
	    public ReloadableResourceBundleMessageSource getMessageSource() {
	        ReloadableResourceBundleMessageSource resource = new ReloadableResourceBundleMessageSource();
	        resource.setBasename("classpath:messages");
	        resource.setDefaultEncoding("UTF-8");
	        return resource;
	    }

}
