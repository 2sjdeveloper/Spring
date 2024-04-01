package com.dbal.app.book.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dbal.app.book.model.BookVO;
import com.dbal.app.book.service.BookService;

@Controller
public class BookController {
	@Autowired	//인터페이스 인젝션(상속받아 구현된 자식 클래스를 주입시켜줌)
	BookService bookService;
	
	//조회 (교수님 풀이)
	@GetMapping("getBook")
	public String getBookList(Model model) {
		//목록조회
		model.addAttribute("list", bookService.getBookList() );
		return "book/list";
		
	}
	/* 승민씨가 알려준거 보고 한거
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/book/bookList");
		mv.addObject("list", bookService.getBookList());
		return mv;
	}
	*/
	
	//등록페이지로 이동
	@GetMapping("insertBook")
	public String insertBookForm(Model model) {
		model.addAttribute("bookNo", bookService.getBookNo());
		return "book/insert";
		
	}
	
	//등록 처리
	@PostMapping("insertBook")
	public String insertBook(BookVO vo) {
		bookService.insertBook(vo);
		return "redirect:getBook";
		
	}
	
	//도서 대여
	@GetMapping("rentBook")
	public String getRent(Model model) {
		model.addAttribute("list", bookService.getRent());
		return "book/rent";
	}
	
	

}
