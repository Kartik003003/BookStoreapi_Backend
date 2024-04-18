package com.loginuser.loginuser.userController;

import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.loginuser.loginuser.Entity.Book;
import com.loginuser.loginuser.Repo.BookRepository;
import com.loginuser.loginuser.Service.impl.BookService;

import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/books")
@CrossOrigin(methods = { RequestMethod.DELETE, RequestMethod.OPTIONS })
public class BookController {

    @Autowired
    private BookService bookService;
    
    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/addbooks")
    public ResponseEntity<String> addBook(@RequestBody Book book, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
        response.setHeader("Access-Control-Max-Age", "3600");

        try {
            bookService.addBook(book);
            System.out.println("new :" + book);
            return ResponseEntity.status(HttpStatus.CREATED).body("Book added successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error adding book: " + e.getMessage());
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book book) {
        Book updatedBook = bookService.updateBook(id, book);
        if (updatedBook != null) {
            return ResponseEntity.ok(updatedBook);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
    	System.out.println("book delete....");
  	try {
           
            Book book = bookRepository.findByBookId(id);
            if (book != null) {
                bookRepository.delete(book);
                return "Book with bookId " + id + " deleted successfully.";
            } else {
                return "Book with bookId " + id + " not found.";
            }
        } catch (Exception e) {
            return "Error deleting book: " + e.getMessage();
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.OPTIONS)
    public ResponseEntity<Void> handleOptionsRequest(@PathVariable Long id, HttpServletResponse response) {
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
        response.setHeader("Access-Control-Max-Age", "3600");
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.createBook(book));
    }
}
