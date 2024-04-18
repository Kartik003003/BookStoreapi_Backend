package com.loginuser.loginuser.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.loginuser.loginuser.Entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	Book findByBookId(Long id);
}

