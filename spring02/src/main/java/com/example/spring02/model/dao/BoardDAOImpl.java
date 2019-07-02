package com.example.spring02.model.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.spring02.model.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<BoardDTO> boardList() {
		return sqlSession.selectList("board.boardList");
	}

	@Override
	public void insertBoard(BoardDTO vo) {
		// TODO Auto-generated method stub

	}

	@Override
	public BoardDTO viewBoard(String userid) {
		return sqlSession.selectOne("board.viewBoard", userid);
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
