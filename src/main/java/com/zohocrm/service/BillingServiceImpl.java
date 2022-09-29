package com.zohocrm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Billing;
import com.zohocrm.repositories.BillingRepository;
@Service
public class BillingServiceImpl implements BillingService {

	@Autowired
	private BillingRepository billingRepo;
	
	@Override
	public void saveBilling(Billing billing) {
		billingRepo.save(billing);
	}

	@Override
	public Billing getOneBilling(long id) {
		Optional<Billing> findById = billingRepo.findById(id);
		Billing billing = findById.get();
		return billing;
	}

	@Override
	public List<Billing> listBillings() {
		List<Billing> billings = billingRepo.findAll();
		return billings;
	}

}
