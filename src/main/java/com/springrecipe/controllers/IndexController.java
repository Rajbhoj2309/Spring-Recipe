package com.springrecipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
	@RequestMapping({" ","/","/index"})
	public String getIndex() {
		
		return "index";
	}
	// both methods are working but we are using @GetMapping is works better than @RequestMapping
//	@GetMapping({" ","/","/index"})
//	public String getIndex1() {
//		
//		return "index";
//	}
	
	// trace endpoint
	@RequestMapping(value = "/trace-endpoint", method = RequestMethod.TRACE)
    @ResponseBody
    public String traceEndpoint() {
        return "TRACE method is supported in this endpoint.";
    }
	
	

}
