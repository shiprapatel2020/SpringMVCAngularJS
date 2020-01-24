package com.journaldev.spring.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.journaldev.spring.model.User;

@RestController("/dashboard")
public class DashboardController {

	@Autowired
	private HttpServletRequest request;
	@Autowired
	User user;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@PostMapping("/post")
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}
	
	@GetMapping("/getUsers")
	public List<User> getUsers() {
		System.out.println("User Page Requested");
		List<User> users= new ArrayList<User>();
		user.setUserName("Shipra");
		users.add(user);
		return users;
	}
	
	
}
