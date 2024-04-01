package com.dbal.app.book.service;

import java.util.List;
import java.util.Map;

import com.dbal.app.book.model.BookVO;

public interface BookService {
	public int getBookNo();
	public List<BookVO> getBookList();
	public boolean insertBook(BookVO vo);
	public List<Map> getRent();

}
