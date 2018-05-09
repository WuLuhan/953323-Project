package com.qinzz.edu;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit Spring配置文件的位置。
@ContextConfiguration(locations ={"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})

public class BaseTest {

}

