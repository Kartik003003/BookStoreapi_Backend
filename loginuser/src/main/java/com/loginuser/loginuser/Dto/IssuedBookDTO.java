package com.loginuser.loginuser.Dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IssuedBookDTO {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long bookId;
    private String bookName;
    private String authorName;
    private String publisherName;
    private Double bookPrice;
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
	@Override
	public String toString() {
		return "IssuedBookDTO [id=" + id + ", bookId=" + bookId + ", bookName=" + bookName + ", authorName="
				+ authorName + ", publisherName=" + publisherName + ", bookPrice=" + bookPrice + ", name=" + name + "]";
	}
	public IssuedBookDTO(Long id, Long bookId, String bookName, String authorName, String publisherName,
			Double bookPrice, String name) {
		
		this.id = id;
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publisherName = publisherName;
		this.bookPrice = bookPrice;
		this.name = name;
	}
    
    
	
}
