package com.example.onlineservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	@RequestMapping({ "/", "index" })
	public String index() {
		return "index";
	}

	@RequestMapping("/webprivate")
	public String webPrivate() {
		return "private";
	}

	@RequestMapping("/webpublic")
	public String loginpub() {
		return "public";
	}

	@RequestMapping("/webadmin")
	public String admin() {
		return "admin";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
}
