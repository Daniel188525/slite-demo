package com.ebao.slite.service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({ 
	"classpath:/META-INF/spring/rpc_server.xml"
	})
public class SliteServerConfig {

}
