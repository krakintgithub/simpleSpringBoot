/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.krakint.simple.springboot.webapp.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

 
@RequestMapping(value = "/hello")
@RestController
@Scope("request")
public class HelloWorldController {
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String sayHi(@PathVariable String name) {
		return "Hello " + name;
	}
}
