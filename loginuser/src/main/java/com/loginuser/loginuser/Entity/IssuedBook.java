package com.loginuser.loginuser.Entity;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "issued_books")
public class IssuedBook implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long bookId;
    private String bookName;
    private String authorName;
    private String publisherName;
    private Double bookPrice;
    private String IssueDate;
    private LocalDate ReturnDate;
    private String name;
    
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

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getIssueDate() {
		return IssueDate;
	}

	public void setIssueDate(String string) {
		IssueDate = string;
	}

	public LocalDate getReturnDate() {
		return ReturnDate;
	}

	public void setReturnDate(LocalDate localDate) {
		ReturnDate = localDate;
	}

	@Override
	public String toString() {
		return "IssuedBook [id=" + id + ", bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName
				+ ", publisherName=" + publisherName + ", bookPrice=" + bookPrice + ", IssueDate=" + IssueDate
				+ ", ReturnDate=" + ReturnDate + ", name=" + name + "]";
	}

	public IssuedBook(Long id, Long bookId, String bookName, String authorName, String publisherName, Double bookPrice,
			String name) {
		
		this.id = id;
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publisherName = publisherName;
		this.bookPrice = bookPrice;
		IssueDate = getIssueDate();
		ReturnDate = getReturnDate();
		this.name = name;
	}

	public void setIssueDate1(String string) {
		// TODO Auto-generated method stub
		IssueDate = string;
	}

	public void setIssueDate(LocalDate now) {
		// TODO Auto-generated method stub
		
	}


	

	


    
}

