package com.itwillbs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class ProjectRunTest {
	
	
	private static final Logger log = LoggerFactory.getLogger(ProjectRunTest.class);
	
	@Test
	public void init() {
		log.info("@@@@@@@@@@@@@ 프로젝트 초기 설정 완료 @@@@@@@@@@@@");
	}

}
