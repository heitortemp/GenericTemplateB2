package br.com.grupoa.generictemplate.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String home(Locale locale) {
		
		logger.debug("Welcome home! The client locale is {}.", locale + " Debug");
		logger.info("Welcome home! The client locale is {}.", locale + " Info");
		logger.warn("Welcome home! The client locale is {}.", locale + " Warning");
		logger.error("Welcome home! The client locale is {}.", locale + " Error");
		
		return "home";
	}
	
	@RequestMapping(value = "config", method = RequestMethod.GET)
	public String config(Locale locale) {
		
		logger.debug("Welcome Config! The client locale is {}.", locale + "Debug");
		logger.info("Welcome Config! The client locale is {}.", locale + " Info");
		logger.warn("Welcome Config! The client locale is {}.", locale + "Warning");
		logger.error("Welcome Config! The client locale is {}.", locale + "Error");
		
		return "config";
	}
	
	@RequestMapping(value = "result", method = RequestMethod.POST)
	public String result(HttpServletRequest request, Locale locale, Model model) {
		
		model.addAttribute("showName", request.getParameter("testeName"));
		
		return "result";
	}	
}
