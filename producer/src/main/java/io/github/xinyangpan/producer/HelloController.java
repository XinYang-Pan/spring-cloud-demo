package io.github.xinyangpan.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {
	@Value("${neo.hello}")
	private String message;

	@RequestMapping("/hello")
	public String index(@RequestParam String name) {
		return "hello " + name + "，" + message;
	}

}