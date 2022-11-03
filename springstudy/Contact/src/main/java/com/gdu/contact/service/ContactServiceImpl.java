package com.gdu.contact.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gdu.contact.domain.ContactDTO;
import com.gdu.contact.repository.ContactDAO;

public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactDAO dao;
	
	@Override
	public List<ContactDTO> findAllContacts(){
		return dao.selectAllContacts();
	}
	
	@Override
	public ContactDTO findContactByNo(int no) {
		return dao.selectContactByNo(no);
	}
	
	@Override
	   public int saveContact(ContactDTO contact) {
	      return dao.insertContact(contact);
	   }

	@Override
	public int modifyContact(ContactDTO contact) {
		return dao.updateContact(contact);
		
	}

	@Override
	public int removeContact(int no) {
		return dao.deleteContact(no);
		
	}

	
}
