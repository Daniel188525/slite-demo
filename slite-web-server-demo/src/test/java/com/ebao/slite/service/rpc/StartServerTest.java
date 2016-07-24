package com.ebao.slite.service.rpc;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ebao.slite.service.config.AppConfig;

/**
 * 
 * 
 * @ClassName: StartServerTest
 * @Description: junit start webApp and start slite framework-publish server
 * @author ZhaoHongshuai
 * @date Jul 24, 2016 4:16:19 PM
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
/*@ContextConfiguration({ 
	"classpath:/config/application-basic.xml", 
	"classpath:/META-INF/spring/rpc_server.xml" 
	})*/
@ContextConfiguration(classes = { AppConfig.class })
public class StartServerTest {

	@Test
	public void start() {
		System.out.println("web app started and slite framework started!");
		try {
			System.in.read();// 按任意键退出
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
