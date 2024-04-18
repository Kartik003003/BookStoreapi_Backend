package com.loginuser.loginuser.Service;

import java.util.List;

import com.loginuser.loginuser.Entity.Book;

public interface BookService {

	 List<Book> getAllBooks();
	 Book getBookById(Long id);
	 Book createBook(Book book);
	 Book updateBook(Long id, Book book);
	 void deleteBook(Long id);
}
