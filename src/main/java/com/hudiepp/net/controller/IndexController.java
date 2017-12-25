package com.hudiepp.net.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hudiepp.net.commons.ProfileBean;

@RestController
public class IndexController {

	@Autowired
	private ProfileBean profileBean;

	@RequestMapping("/")
	public Object index() {

		return profileBean;
	}

}
