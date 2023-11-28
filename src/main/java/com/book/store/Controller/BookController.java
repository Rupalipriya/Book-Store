package com.book.store.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.store.Entity.Book;
import com.book.store.Service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookservice;

	@PostMapping("/savebook")
	ResponseEntity<Book> saveEntity(@RequestBody Book book) {
		Book book2 = bookservice.savebook(book);
		return new ResponseEntity<Book>(book2, HttpStatus.CREATED);
	}

	@GetMapping("/getbookbyid/{id}")
	ResponseEntity<Book> findbyidEntity(@PathVariable Integer id) {
		Book book1 = bookservice.getbybookid(id);
		return new ResponseEntity<Book>(book1, HttpStatus.OK);

	}

	@PutMapping("/updatebook")
	ResponseEntity<Book> updateEntity(@RequestBody Book book) {
		Book book2 = bookservice.updatebookBook(book);
		return new ResponseEntity<Book>(book2, HttpStatus.ACCEPTED);

	}

	@DeleteMapping("/deleteid/{id}")
	ResponseEntity<String> deleteEntity(@PathVariable Integer id) {
		String s = bookservice.deletebyid(id);
		return new ResponseEntity<String>(s, HttpStatus.OK);

	}

	@GetMapping("/getallbooks")
	ResponseEntity<List<Book>> getbyauthEntity() {
		List<Book> bookList = bookservice.getbyauthor();
		return new ResponseEntity<List<Book>>(bookList, HttpStatus.OK);
	}
}
