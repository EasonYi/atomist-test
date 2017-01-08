package com.eason;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AtomistTestApplication.class)
@WebAppConfiguration
public class AtomistTestApplicationTests {

    @Test
    public void contextLoads() {
    }
}
