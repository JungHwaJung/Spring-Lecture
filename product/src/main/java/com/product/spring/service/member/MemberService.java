package com.product.spring.service.member;

import javax.servlet.http.HttpSession;

import com.product.spring.model.member.dto.MemberDTO;

public interface MemberService {
	public String loginCheck(MemberDTO dto, HttpSession session);
	public void logout(HttpSession session);
}
