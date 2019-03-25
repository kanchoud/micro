package org.milkyway.messageservice.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="greeting-service",url="localhost:8585")
public interface GreetingsServiceProxy {
	@GetMapping("/greetings")
	public String getGreetings();

}
