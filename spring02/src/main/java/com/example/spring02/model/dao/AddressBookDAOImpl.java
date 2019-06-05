package com.example.spring02.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.spring02.model.dto.AddressBookDTO;

@Repository
public class AddressBookDAOImpl implements AddressBookDAO {

	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<AddressBookDTO> addressBookList() {
		return sqlSession.selectList("address.addressBookList");
	}

	@Override
	public void insertAddressBook(AddressBookDTO vo) {
		sqlSession.insert("address.insertAddressBook");
	}

	@Override
	public AddressBookDTO viewAddressBook(String userid) {
		return sqlSession.selectOne("address.viewAddressBook", userid);
	}

	@Override
	public void deleteAddressBook(String userid) {
		sqlSession.delete("address.deleteAddressBook", userid);
	}

	@Override
	public void updateAddressBook(AddressBookDTO vo) {
		sqlSession.update("address.updateAddressBook", vo);
	}

	@Override
	public boolean checkPw(String userid, String passwd) {
		boolean result = false;
		Map<String, String> map = new HashMap<String, String>();
		map.put("userid", userid);
		map.put("passwd", passwd);
		int count = sqlSession.selectOne("address.checkPw", map);
		if(count == 1) 
			result = true;
		return result;
	}

}
