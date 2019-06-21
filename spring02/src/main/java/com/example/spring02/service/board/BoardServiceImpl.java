package com.example.spring02.service.board;

import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	BoardDAO boardDao;
	
	@Override
	public void create(BoardDTO dto) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BoardDTO read(int bno) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(BoardDTO dto) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int bno) throws Exeption {
		// TODO Auto-generated method stub
		
	}

	//게시물 목록
	@Override
	public List<BoardDTO> listAll(int start, int end, String search_option, String keyword) throws Exception {
		return boardDao.listAll(start, end, search_option, keyword);
	}

	@Override
	public void increaseViewcnt(int bno) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int countArticle(String search_option, String keyword) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}


}
