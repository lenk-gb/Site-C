package br.com.chromatox;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import br.com.chromatox.run.ChromatoxApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ChromatoxApplication.class)
@WebAppConfiguration
public class ChromatoxApplicationTests {

	@Test
	public void contextLoads() {
	}

}
