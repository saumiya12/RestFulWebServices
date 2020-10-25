package com.rest.webservices.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class FilteringController {

	// field1,field2
	@GetMapping("/filtering")
	public SomeBean retrieveSomeBean() {
		SomeBean someBean = new SomeBean("value1", "value2", "value3");
		return  someBean;
	}

	// field2, field3
	@GetMapping("/filtering-list")
	public List<SomeBean> retrieveListOfSomeBeans() {
		List<SomeBean> list = Arrays.asList(new SomeBean("value1", "value2", "value3"),
				new SomeBean("value12", "value22", "value32"));
		return  list;

	}

}

