package org.susi.integration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.susi.integration.DeliveryService;
import junit.framework.Assert;

 
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DeliveryService.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class EurekaClientApplicationTests {

	static ConfigurableApplicationContext eurekaServer;

	@Test
	public void alwaysTrue() {
		
		Assert.assertEquals(1, 1);
	}

}
