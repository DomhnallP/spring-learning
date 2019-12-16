package com.domhnall.springwebapp.repo;

import com.domhnall.springwebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
