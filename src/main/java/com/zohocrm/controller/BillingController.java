package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Billing;
import com.zohocrm.entities.Contact;
import com.zohocrm.service.BillingService;
import com.zohocrm.service.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private ContactService contactService;
	
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/showCreateBillPage")
	public String showCreateBillPage(@RequestParam("id")long id, ModelMap model) {
		Contact contact = contactService.getOneContact(id);
		model.addAttribute("contact", contact);
		return "create_billing";
	}
	
	@RequestMapping("saveBilling")
	public String createBillPage(@ModelAttribute("billing")Billing billing, ModelMap model) {
		billingService.saveBilling(billing);
		
		List<Billing> billings = billingService.listBillings();
		model.addAttribute("billings", billings);
		return "search_billing_result";
	}
	
	@RequestMapping("/billingInfo")
	public String billingInfoPage(@RequestParam("id")long id, ModelMap model) {
		Billing billing = billingService.getOneBilling(id);
		model.addAttribute("billing", billing);
		return "billing_info";
	}
	
	@RequestMapping("/listBilling")
	public String listAllBilling(ModelMap model) {
		List<Billing> billings = billingService.listBillings();
		model.addAttribute("billings", billings);
		return "search_billing_result";
	}
	
}
