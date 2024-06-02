package billGuru.core.conf;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.configuration.reloading.FileChangedReloadingStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;



@Configuration
@Import (value = { MvcConfiguration.class, SecurityConfiguration.class, JpaConfiguration.class, AppBeansConfiguration.class })
@EnableAspectJAutoProxy
@ComponentScan (basePackages = { "billGuru.controllers", "billGuru.services", "billGuru.domain", "billGuru.dao", "billGuru.rest", "billGuru.dto", "billGuru.core.security"})
public class SpringConfiguration {
	@Bean (name = "appConfigurationProperties")
	public org.apache.commons.configuration.Configuration applicationConfiguration() throws ConfigurationException {
		System.out.println("PASSED!");
		PropertiesConfiguration configuration = new PropertiesConfiguration("appconfiguration.properties");
		configuration.setReloadingStrategy(new FileChangedReloadingStrategy());
		return configuration;
	}
}
