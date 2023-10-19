package com.kanwar.spring6di;

import com.kanwar.spring6di.controllers.MyController;
import com.kanwar.spring6di.services.GreetingServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void testAutowiredMycontroller() {
		System.out.println(myController.gotoPath());
	}

	@Test
	void testMyControllerFromCtx() {
		MyController bean = applicationContext.getBean(MyController.class);
		System.out.println(bean.gotoPath());
	}

	@Test
	void contextLoads() {
	}

}
