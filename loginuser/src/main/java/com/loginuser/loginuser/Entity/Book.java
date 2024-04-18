package com.loginuser.loginuser.Entity;

import jakarta.persistence.*;
//@Lombok
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long bookId;
    private String bookName;
    private String authorName;
    private String publisherName;
    private String publishingDate;
    private int noOfBooksAvailable;
    private int noOfBooksIssued;
    private String bookImage;
    private int bookPrice;


    public Book() {
    }

    public Book(Long bookId, String bookName, String authorName, String publisherName, String publishingDate, int noOfBooksAvailable, int noOfBooksIssued, String bookImage) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.publishingDate = publishingDate;
        this.noOfBooksAvailable = noOfBooksAvailable;
        this.noOfBooksIssued = noOfBooksIssued;
        this.bookImage = bookImage;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublishingDate() {
		return publishingDate;
	}

	public void setPublishingDate(String publishingDate) {
		this.publishingDate = publishingDate;
	}

	public int getNoOfBooksAvailable() {
		return noOfBooksAvailable;
	}

	public void setNoOfBooksAvailable(int noOfBooksAvailable) {
		this.noOfBooksAvailable = noOfBooksAvailable;
	}

	public int getNoOfBooksIssued() {
		return noOfBooksIssued;
	}

	public void setNoOfBooksIssued(int noOfBooksIssued) {
		this.noOfBooksIssued = noOfBooksIssued;
	}

	public String getBookImage() {
		return bookImage;
	}

	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

  
    
    
}

