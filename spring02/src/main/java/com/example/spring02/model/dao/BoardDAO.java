package com.example.spring02.model.dao;

import java.util.List;

import com.example.spring02.model.dto.BoardDTO;

public interface BoardDAO {
	public List<BoardDTO> boardList();
	public void insertBoard(BoardDTO vo);
	public BoardDTO viewBoard(String userid);
	public void deleteBoard(String userid);
	public void updateBoard(BoardDTO vo);
}
