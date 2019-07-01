package com.example.spring02.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.spring02.model.dao.BoardDAO;
import com.example.spring02.model.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	BoardDAO bDao;
	
	@Override
	public List<BoardDTO> boardList() {
		return bDao.boardList();
	}

	@Override
	public void insertBoard(BoardDTO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public BoardDTO viewBoard(String userid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteBoard(String userid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateBoard(BoardDTO vo) {
		// TODO Auto-generated method stub

	}

}
