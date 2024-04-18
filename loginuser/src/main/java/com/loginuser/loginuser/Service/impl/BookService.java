package com.loginuser.loginuser.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginuser.loginuser.Entity.Book;
import com.loginuser.loginuser.Repo.BookRepository;

@Service
public class BookService {

	
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    
    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    
    public Book updateBook(Long id, Book book) {
        Book existingBook = getBookById(id);
//        System.out.println("error : "+book.getNoOfBooksAvailable());
        if (existingBook != null) {
            book.setBookName(book.getBookName());
            book.setAuthorName(book.getAuthorName());
            book.setPublisherName(book.getPublisherName());
            book.setPublishingDate(book.getPublishingDate());
            book.setNoOfBooksAvailable(book.getNoOfBooksAvailable());
            book.setNoOfBooksIssued(book.getNoOfBooksIssued());
            book.setBookImage(book.getBookImage());
            book.setBookPrice(book.getBookPrice());
            System.out.println(book.getBookName());            
        }
        return bookRepository.save(book);
    }
    
    public void deleteBook(Long id) {
    	System.out.println("ID is "+id);
    	bookRepository.deleteById(id);
        
    }


	public Book addBook(Book book) {
		return bookRepository.save(book);
	}
}
