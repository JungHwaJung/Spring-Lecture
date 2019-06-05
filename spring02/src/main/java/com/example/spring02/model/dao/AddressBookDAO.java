package com.example.spring02.model.dao;

import java.util.List;

import com.example.spring02.model.dto.AddressBookDTO;

public interface AddressBookDAO {
	public List<AddressBookDTO> addressBookList();
	public void insertAddressBook(AddressBookDTO vo);
	public AddressBookDTO viewAddressBook(String userid);
	public void deleteAddressBook(String userid);
	public void updateAddressBook(AddressBookDTO vo);
	public boolean checkPw(String userid, String passwd);
}
