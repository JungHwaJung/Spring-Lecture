package com.product.spring.model.member.dao;

import com.product.spring.model.member.dto.MemberDTO;

public interface MemberDAO {
	public String loginCheck(MemberDTO dto);
}
