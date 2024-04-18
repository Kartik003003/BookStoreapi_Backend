package com.loginuser.loginuser.Service;

import java.util.List;

import com.loginuser.loginuser.Entity.IssuedBook;

public interface IssueBookService {

    void issueBook(Long bookId) throws Exception;

	List<IssuedBook> getAllBooks();

	void issueBook(Long bookId, String userEmail) throws Exception;

}
