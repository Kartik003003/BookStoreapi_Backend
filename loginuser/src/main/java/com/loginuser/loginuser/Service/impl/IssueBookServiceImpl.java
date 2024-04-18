package com.loginuser.loginuser.Service.impl;

import java.time.LocalDate;
import java.util.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginuser.loginuser.Entity.Book;
import com.loginuser.loginuser.Entity.IssuedBook;
import com.loginuser.loginuser.Entity.User;
import com.loginuser.loginuser.Repo.*;
import com.loginuser.loginuser.Service.IssueBookService;

@Service
public class IssueBookServiceImpl implements IssueBookService {

    @Autowired
    private IssueBookRepository issueBookRepository;
    private BookRepository bookRepository;
    private UserRepository userRepository;
    private Book book;
    private User user;
    
    @Override
    public void issueBook(Long bookId, String userEmail) throws Exception {
    	user = userRepository.findByEmail(userEmail);
    	if (user == null) {
    	    throw new Exception("User not found");
    	}
    	IssuedBook issueBook = new IssuedBook(bookId, bookId, userEmail, userEmail, userEmail, null, userEmail);
    	if(book.getBookId().equals(bookId)) {
    	issueBook.setBookName(book.getBookName());
    	issueBook.setAuthorName(book.getAuthorName());
    	issueBook.setIssueDate(LocalDate.now());
    	issueBook.setReturnDate(LocalDate.now().plusDays(7));
    	issueBook.setName(user.getFullname());
    	book.setNoOfBooksAvailable(book.getNoOfBooksAvailable() - 1);
    	bookRepository.save(book);
    	issueBookRepository.save(issueBook);
    	}
    	
    }



    @Override
    public List<IssuedBook> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        List<IssuedBook> issuedBooks = new ArrayList<>();

        for (Book book : books) {//null q?
            IssuedBook issuedBook = new IssuedBook(null, null, null, null, null, null, null);
            issuedBook.setBookId(book.getBookId());
            issuedBook.setIssueDate(LocalDate.now());
            issuedBook.setReturnDate(LocalDate.now().plusDays(7));
            issuedBook.setIssueDate("John Doe");
            issuedBooks.add(issuedBook);
        }

        return issuedBooks;
    }



	@Override
	public void issueBook(Long bookId) throws Exception {
		// TODO Auto-generated method stub
		
	}



	
}