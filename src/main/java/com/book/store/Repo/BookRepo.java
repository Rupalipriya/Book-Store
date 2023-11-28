package com.book.store.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.store.Entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}
