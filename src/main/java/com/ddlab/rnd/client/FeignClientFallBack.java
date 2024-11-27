package com.ddlab.rnd.client;

import org.springframework.stereotype.Component;

@Component
public class FeignClientFallBack implements SampleFeignClient {

	@Override
	public String getEmpById(int id) {
		return "No Response from server ...";
	}

	@Override
	public String getCountryDetailByCode(String countryCode) {
		return "Exception received from external service ...";
	}

}
