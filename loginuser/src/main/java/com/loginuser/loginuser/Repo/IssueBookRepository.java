package com.loginuser.loginuser.Repo;


import com.loginuser.loginuser.Entity.Book;
import com.loginuser.loginuser.Entity.IssuedBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssueBookRepository extends JpaRepository<IssuedBook, Long> {

	void save(Book book);
}
