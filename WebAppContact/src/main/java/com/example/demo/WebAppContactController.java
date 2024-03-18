package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import access.ContactAccess;
import model.Contact;

@Controller
public class WebAppContactController {
	
	private ContactAccess contactRepo;
	
    
    public WebAppContactController(ContactAccess contactRepo) {
        this.contactRepo = contactRepo;
    }
    
	@GetMapping("/home") 
	public String homeContact(Model model)
	{
		List<Contact> contacts = contactRepo.list();
		model.addAttribute("contacts", contacts);
        return "home";
	}
	
	@GetMapping("/new") 
	public String newContact()
	{
		return "New";		
	}
	
	@GetMapping("/edit") 
    @ResponseBody
	public String editContact()
	{
		return "Edit";		
	}
	
	
	@GetMapping("/del") 
    @ResponseBody
	public String delContact()
	{
		return "Delete";		
	}
	
	
	
}
