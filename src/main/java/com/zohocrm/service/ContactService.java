package com.zohocrm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zohocrm.entities.Contact;

@Service
public interface ContactService {

	public void saveContact(Contact contact);

	public List<Contact> listContacts();

	public Contact getOneContact(long id);


}
