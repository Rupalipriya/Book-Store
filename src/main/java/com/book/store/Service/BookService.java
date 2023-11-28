package com.book.store.Service;

import java.util.List;

import com.book.store.Entity.Book;

public interface BookService {
	Book savebook(Book book);

	Book getbybookid(Integer id);

	Book updatebookBook(Book book);

	String deletebyid(Integer id);

	List<Book> getbyauthor();

}
