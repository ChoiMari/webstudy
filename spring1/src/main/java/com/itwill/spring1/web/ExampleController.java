package com.itwill.spring1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

//@ 애너테이션 import해야함
@Slf4j //->private static final Logger log = LoggerFactory.getLogger(ExampleController.class); 코드를 삽입.롬복에서 제공하는 애너테이션
@Controller //스프링 프레임 워크에서 제공하는 애너테이션
public class ExampleController {
	
	@GetMapping("/")
	public String home() {
		log.debug("home()");//log변수 만든적 없지만 @Slf4j을 사용해서 사용 가능함.
		
		return "home";
	}
}
