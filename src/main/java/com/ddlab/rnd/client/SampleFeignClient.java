package com.ddlab.rnd.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "SomeFeignClientName", url = "http://localhost:8081/sample", fallback = FeignClientFallBack.class)
public interface SampleFeignClient {

	@GetMapping("/v1/emp/{id}")
	String getEmpById(@PathVariable("id") int id);
	
	// For handling exception
	@GetMapping("/v1/country/{countryCode}")
	String getCountryDetailByCode(@PathVariable("countryCode") String countryCode);
}
