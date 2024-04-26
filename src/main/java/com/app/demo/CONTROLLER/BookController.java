package com.app.demo.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.demo.DTO.BookDto;
import com.app.demo.DTO.MyBook;
import com.app.demo.SERVICE.BookService;
import com.app.demo.SERVICE.MyBookService;


@Controller
public class BookController {
	@Autowired
	private BookService bs;
	@Autowired
	private MyBookService ts;
	@GetMapping("/")
	public String home() {
		return"home";
	}
	@GetMapping("/book_register")
	public String BookRegister() {
		return"BookRegister";
	}
	@PostMapping("/save")
	public String Addbook(@ModelAttribute BookDto dt) {
		bs.SaveBooks(dt);
		return"redirect:/book_list";
	}
	@GetMapping("/book_list")
	public ModelAndView  getallbooks() {
		List<BookDto>List=bs.getallbooks();
		return new ModelAndView("booklist","book",List);
		
	}
	@RequestMapping("/mylist/{id}")
	public String getMylist(@PathVariable("id") int id, Model model) {
		BookDto b = bs.getBookById(id);

		MyBook mb = new MyBook(b.getId(), b.getName(), b.getAuthor(),b.getPrice());
		ts.SaveBooks(mb);
		return "redirect:/my_books";
	}
	
	
	@GetMapping("my_books")
	public String getMybook(Model model) {
		List<MyBook> list= ts.getallbooks();
		model.addAttribute("book", list);
		return ("mybook");
	}

	@RequestMapping("/editBook/{id}")
    public String editBook( @PathVariable("id") int id, Model model) {
		BookDto b = bs.getBookById(id);
        model.addAttribute("book", b);
        return "bookeedit";
    }

    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") int id) {
    	bs.deleteById(id);
        return "redirect:/book_list";
    }
    @RequestMapping("/deleteMyBook/{id}")
    public String deleteMyBook(@PathVariable("id") int id) {
    	ts.deleteById(id);
        return "redirect:/my_books";
    }

}
