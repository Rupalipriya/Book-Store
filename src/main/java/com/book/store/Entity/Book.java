package com.book.store.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	@Id
	private Integer id;
	@Column
	private String Author;
	@Column
	private String ISBN;
	@Column
	private String PublishedDate;
	@Column
	private String genre;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getPublishedDate() {
		return PublishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		PublishedDate = publishedDate;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", Author=" + Author + ", ISBN=" + ISBN + ", PublishedDate=" + PublishedDate
				+ ", genre=" + genre + "]";
	}

}
