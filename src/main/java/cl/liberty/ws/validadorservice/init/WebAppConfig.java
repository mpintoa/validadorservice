package cl.liberty.ws.validadorservice.init;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration // Specifies the class as configuration
@EnableTransactionManagement
@ComponentScans(value = { @ComponentScan("cl.liberty.ws.validadorservice.dao"),
		@ComponentScan("cl.liberty.ws.validadorservice.controller"),
      @ComponentScan("cl.liberty.ws.validadorservice.service") })
public class WebAppConfig {

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");

		return viewResolver;
	}

	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	@Bean
   public LocalEntityManagerFactoryBean geEntityManagerFactoryBean() {
      LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
      factoryBean.setPersistenceUnitName("validadorservice");
      return factoryBean;
   }

   @Bean
   public JpaTransactionManager geJpaTransactionManager() {
      JpaTransactionManager transactionManager = new JpaTransactionManager();
      transactionManager.setEntityManagerFactory(geEntityManagerFactoryBean().getObject());
      return transactionManager;
   }
}
