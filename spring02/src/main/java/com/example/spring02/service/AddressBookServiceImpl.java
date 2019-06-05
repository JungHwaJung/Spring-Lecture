package com.example.spring02.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.spring02.model.dao.AddressBookDAO;
import com.example.spring02.model.dto.AddressBookDTO;

@Service
public class AddressBookServiceImpl implements AddressBookService {

	@Inject
	AddressBookDAO addressBookDao;
	
	@Override
	public List<AddressBookDTO> addressBookList() {
		return addressBookDao.addressBookList();
	}

	@Override
	public void insertAddressBook(AddressBookDTO vo) {
		addressBookDao.insertAddressBook(vo);
	}

	@Override
	public AddressBookDTO viewAddressBook(String userid) {
		return addressBookDao.viewAddressBook(userid);
	}

	@Override
	public void deleteAddressBook(String userid) {
		addressBookDao.deleteAddressBook(userid);
	}

	@Override
	public void updateAddressBook(AddressBookDTO vo) {
		addressBookDao.updateAddressBook(vo);
	}

	@Override
	public boolean checkPw(String userid, String passwd) {
		return addressBookDao.checkPw(userid, passwd);
	}

}
