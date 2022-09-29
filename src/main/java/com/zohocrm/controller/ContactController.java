package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/listAllContacts")
	public String listAllContacts(ModelMap model) {
		List<Contact> contacts = contactService.listContacts();
		model.addAttribute("contacts",contacts);
		return "search_contacts_result";
	}
	@RequestMapping("/contactInfo")
	public String contactInfoPage(@RequestParam("id")long id, ModelMap model) {
		Contact contact = contactService.getOneContact(id);
		model.addAttribute("contact", contact);
		return "contact_info";
	}
	
	
}
