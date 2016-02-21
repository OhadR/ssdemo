package com.ohadr.security.examples.mvc;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ohadr.security.examples.DemoService;



/**
 * @author Ryan Heaton
 * @author Dave Syer
 */
@Controller
@RequestMapping("/secured/hello")
public class DemoController
{
	private static final org.slf4j.Logger log = LoggerFactory.getLogger(DemoController.class.getName());

    @Autowired
	private DemoService butkeDemoService;

    @RequestMapping(method = RequestMethod.GET)
	public String demo(ModelMap model) throws Exception {
    	log.info("#### demo is called, for file");
		model.addAttribute("message", butkeDemoService.getTrustedMessage());
		return "hello";
	}


	public void setButkeDemoService(DemoService butkeDemoService) {
		this.butkeDemoService = butkeDemoService;
	}

}
