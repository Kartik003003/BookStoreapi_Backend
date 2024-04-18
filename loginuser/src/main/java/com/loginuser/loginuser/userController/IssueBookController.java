package com.loginuser.loginuser.userController;

import com.loginuser.loginuser.Entity.IssuedBook;
import com.loginuser.loginuser.Service.impl.IssueBookServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/issue-books") 
public class IssueBookController {

    @Autowired
    private IssueBookServiceImpl issueBookService;

    @GetMapping("/all") 
    public ResponseEntity<List<IssuedBook>> getAllIssuedBooks() {
        List<IssuedBook> issuedBooks = issueBookService.getAllBooks();
        return new ResponseEntity<>(issuedBooks, HttpStatus.OK);
    }

    @PostMapping("/issue/{bookId}/{usernm}")
    public ResponseEntity<String> issueBook(@PathVariable Long bookId, @PathVariable String userEmail) {
        try {
            issueBookService.issueBook(bookId, userEmail);
            return new ResponseEntity<>("Book issued successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}