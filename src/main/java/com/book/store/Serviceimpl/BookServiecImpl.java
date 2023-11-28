package com.book.store.Serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.store.Entity.Book;
import com.book.store.Repo.BookRepo;
import com.book.store.Service.BookService;

@Service
public class BookServiecImpl implements BookService {

	@Autowired
	private BookRepo bookRepo;

	@Override
	public Book savebook(Book book) {
		Book book1 = bookRepo.save(book);
		return book1;
	}

	@Override
	public Book getbybookid(Integer id) {
		Optional<Book> op = bookRepo.findById(id);
		return op.get();
	}

	@Override
	public Book updatebookBook(Book book) {
		Optional<Book> op = bookRepo.findById(book.getId());
		Book book1 = op.get();
		book1.setAuthor(book.getAuthor());

		return bookRepo.save(book1);
	}

	@Override
	public String deletebyid(Integer id) {
		bookRepo.deleteById(id);

		return "your id has been deleted";

	}

	@Override
	public List<Book> getbyauthor() {
		return bookRepo.findAll();

	}

}
