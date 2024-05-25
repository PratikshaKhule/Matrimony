package com.MatrimonyProject.Matrimony.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MatrimonyProject.Matrimony.Entity.Registration;
import com.MatrimonyProject.Matrimony.Service.ServiceMatrimony;

@RestController
@RequestMapping("Show")
public class ControllerMatrimony
{
	@Autowired
	ServiceMatrimony service;
	
	@GetMapping("check")
	public String Check_API() 
	{
		return "You And Me Forever Matrimony In Your Service Now❤️";
	System.out.println("hii");
	}

	@GetMapping ("insert")
	public String register(@RequestBody Registration member)  
	{
		return service.register(member);
	}
}
