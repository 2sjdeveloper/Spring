package com.dbal.app.book.mapper;

import java.util.List;
import java.util.Map;

import com.dbal.app.book.model.BookVO;

public interface BookMapper {
	public int getBookNo();
	public List<BookVO> getBookList();  // Mapper.xml에서 오는게 단건이면 그냥 BookVO 여러건이면 List	
	public int insertBook(BookVO vo);
	public List<Map> getRent();
}
