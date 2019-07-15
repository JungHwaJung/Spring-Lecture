package com.product.spring.service.member;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.product.spring.model.member.dao.MemberDAO;
import com.product.spring.model.member.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	MemberDAO memberDao;
	
	@Override
	public String loginCheck(MemberDTO dto, HttpSession session) {
		//맞으면 이름이 넘어오고 틀리면 null이 넘어옴
		String name = memberDao.loginCheck(dto);
		
		if(name != null) { //맞으면
			//세션변수 등록
			session.setAttribute("userid", dto.getUserid());
			session.setAttribute("name", name);
		}
		return name;
	}

	@Override
	public void logout(HttpSession session) {
		session.invalidate();
	}

}
