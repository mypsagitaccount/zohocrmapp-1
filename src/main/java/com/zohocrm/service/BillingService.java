package com.zohocrm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zohocrm.entities.Billing;

@Service
public interface BillingService {
	public void saveBilling(Billing billing);

	public Billing getOneBilling(long id);

	public List<Billing> listBillings();
}
