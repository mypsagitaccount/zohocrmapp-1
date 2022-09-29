package com.zohocrm.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.zohocrm.entities.Lead;

@Service
public interface LeadService {
	
	public void saveOneLead(Lead lead);

	public Lead getOneLead(long id);

	public void deleteOneLeadById(long id);

	public List<Lead> listLeads();




}
