package com.ebao.slite.service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({ 
	"classpath:/config/application-basic.xml"
	})
@Import({ SliteServerConfig.class })
public class AppConfig {
}
