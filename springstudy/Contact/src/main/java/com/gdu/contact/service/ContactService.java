package com.gdu.contact.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gdu.contact.domain.ContactDTO;

public interface ContactService {

	public List<ContactDTO> findAllContacts();
	public ContactDTO findContactByNo(int no);
	public int saveContact(ContactDTO contact);
	public int removeContact(int no);
	public int modifyContact(ContactDTO contact);
	public void register(HttpServletRequest request, HttpServletResponse response);

	

}
